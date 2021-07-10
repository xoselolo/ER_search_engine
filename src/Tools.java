import org.apache.poi.ss.usermodel.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;

public class Tools {
    private static HashMap<String, EscapeRoom> allER;
    private static final int RADIUS = 5000;

    // PLACES API KEY
    public static String AND_API_KEY = "&key=";
    public static final String PLACES_FIND_ER_initial = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?keyword=Escape%20Room&location=";
    public static final String GEOCODING_FIND_CITY = "https://maps.googleapis.com/maps/api/geocode/json?address=";
    public static final String PLACE_DETAILS_initial = "https://maps.googleapis.com/maps/api/place/details/json?place_id=";
    public static final String PLACE_DETAILS_options = "&fields=name,vicinity,website,international_phone_number,rating,business_status,opening_hours";

    // Create URL methods
    public static String createUrlFindER(double latitude, double longitude, double radius){
        StringBuilder builder = new StringBuilder(Tools.PLACES_FIND_ER_initial);
        builder.append(latitude).append(",").append(longitude).append("&radius=").append(radius);
        builder.append(Tools.AND_API_KEY);
        //System.out.println(builder.toString());
        return builder.toString();
    }

    public static String createUrlFindER(double latitude, double longitude, double radius, String pageToken){
        StringBuilder builder = new StringBuilder(Tools.PLACES_FIND_ER_initial);
        builder.append(latitude).append(",").append(longitude).append("&radius=").append(radius);
        builder.append("&pagetoken=").append(pageToken);
        builder.append(Tools.AND_API_KEY);
        //System.out.println(builder.toString());
        return builder.toString();
    }

    public static String createUrlFindCityLocation(String city, String country){
        StringBuilder builder = new StringBuilder(Tools.GEOCODING_FIND_CITY);
        builder.append(city.replace(" ", "%20")).append(",%20").append(country);
        builder.append(Tools.AND_API_KEY);
        //System.out.println(builder.toString());
        System.out.println(city);
        return builder.toString();
    }

    public static String createUrlFindERdetails(String place_id){
        StringBuilder builder = new StringBuilder(Tools.PLACE_DETAILS_initial);
        builder.append(place_id);
        builder.append(Tools.PLACE_DETAILS_options);
        builder.append(Tools.AND_API_KEY);
        //System.out.println(builder.toString());
        return builder.toString();
    }

    // Read JSON request methods
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    // Excel methods
    public static void styleSheetCityER(Workbook wb, Sheet sheetCity) {
        Row firstRow = sheetCity.createRow(0);

        CellStyle style = wb.createCellStyle();
        Font font = wb.createFont();
        font.setBold(true);
        style.setFont(font);

        Cell nameCell = firstRow.createCell(0);
        nameCell.setCellValue("NAME");
        nameCell.setCellStyle(style);

        Cell idCell = firstRow.createCell(1);
        idCell.setCellValue("ID");
        idCell.setCellStyle(style);

        Cell websiteCell = firstRow.createCell(2);
        websiteCell.setCellValue("WEBSITE");
        websiteCell.setCellStyle(style);

        Cell phoneCell = firstRow.createCell(3);
        phoneCell.setCellValue("PHONE");
        phoneCell.setCellStyle(style);

        Cell ratingCell = firstRow.createCell(4);
        ratingCell.setCellValue("RATING");
        ratingCell.setCellStyle(style);

        Cell directionCell = firstRow.createCell(5);
        directionCell.setCellValue("ADDRESS");
        directionCell.setCellStyle(style);

        Cell statusCell = firstRow.createCell(6);
        statusCell.setCellValue("BUSINESS STATUS");
        statusCell.setCellStyle(style);
    }

    public static void newEntryCityER(Sheet sheetCity, EscapeRoom er, int row) {
        Row entry = sheetCity.createRow(row);

        // name, id, website, phone, rating, direction
        Cell nameCell = entry.createCell(0);
        if (er.getName() == null){
            nameCell.setCellValue("---");
        }else{
            nameCell.setCellValue(er.getName());
        }

        Cell idCell = entry.createCell(1);
        if (er.getPlace_id() == null){
            idCell.setCellValue("---");
        }else{
            idCell.setCellValue(er.getPlace_id());
        }

        Cell websiteCell = entry.createCell(2);
        if (er.getWebsite() == null){
            websiteCell.setCellValue("---");
        }else{
            websiteCell.setCellValue(er.getWebsite());
        }

        Cell phoneCell = entry.createCell(3);
        if (er.getInternational_phone_number() == null){
            phoneCell.setCellValue("---");
        }else{
            phoneCell.setCellValue(er.getInternational_phone_number());
        }

        Cell ratingCell = entry.createCell(4);
        if (er.getRating() == null){
            ratingCell.setCellValue("---");
        }else{
            ratingCell.setCellValue(er.getRating().toString());
        }

        Cell vicinityCell = entry.createCell(5);
        if (er.getDirection() == null){
            vicinityCell.setCellValue("---");
        }else{
            vicinityCell.setCellValue(er.getDirection());
        }

        Cell statusCell = entry.createCell(6);
        if (er.getBusiness_status() == null){
            statusCell.setCellValue("---");
        }else{
            statusCell.setCellValue(er.getBusiness_status());
        }

    }

    public static int newCity(Location location, Sheet sheetCity, Sheet allSheet, int allEntries) throws IOException {
        JSONObject response = Requester.requestER(location.getLat(), location.getLng(), RADIUS);
        if (response.getString("status").compareTo("OK") == 0){
            JSONArray results = response.getJSONArray("results");

            int total_rows = 1;
            int num_results = results.length();
            for (int i = 0; i < num_results; i++){
                JSONObject result = results.getJSONObject(i);
                String place_id = result.getString("place_id");

                EscapeRoom er = Requester.requestERdetails(place_id);
                Tools.newEntryCityER(sheetCity, er, total_rows);
                total_rows++;
                if (!Tools.existsER(er)){
                    Tools.insertER(er);
                    Tools.newEntryCityER(allSheet, er, allEntries);
                    allEntries++;
                }
            }

            String next_page_token;
            try{
                next_page_token = response.getString("next_page_token");
            }catch (Exception e){
                next_page_token = null;
            }

            while (next_page_token != null){
                response = Requester.requestER(location.getLat(), location.getLng(), RADIUS, next_page_token);
                if (response.getString("status").compareTo("OK") == 0){
                    results = response.getJSONArray("results");

                    num_results = results.length();
                    for (int i = 0; i < num_results; i++){
                        JSONObject result = results.getJSONObject(i);
                        String place_id = result.getString("place_id");

                        EscapeRoom er = Requester.requestERdetails(place_id);
                        Tools.newEntryCityER(sheetCity, er, total_rows);
                        total_rows++;
                        if (!Tools.existsER(er)){
                            Tools.insertER(er);
                            Tools.newEntryCityER(allSheet, er, allEntries);
                            allEntries++;
                        }
                    }

                    try{
                        next_page_token = response.getString("next_page_token");
                    }catch (Exception e){
                        next_page_token = null;
                    }
                }else {
                    next_page_token = null;
                }
            }
        }
        return allEntries;
    }

    public static void initAllER(){
        allER = new HashMap<String, EscapeRoom>();
    }

    public static boolean existsER(EscapeRoom er){
        return allER.get(er.getPlace_id()) != null;
    }

    public static void insertER(EscapeRoom er){
        allER.put(er.getPlace_id(), er);
    }
}
