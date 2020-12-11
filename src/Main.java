import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        try {
            getApiKey(args[0]);

            try{

                CitiesDir citiesDir = initDir();

                try{
                    String country = "Spain";
                    String region = "Barcelona";
                    ArrayList<String> cities = citiesDir.getCountryRegionCities(country, region);

                    // Creamos Excel
                    Workbook wb = new HSSFWorkbook();
                    OutputStream fileOut = new FileOutputStream("output_files/EscapeRooms_" + country + "_prov_" + region + ".xls");

                    Sheet allSheet = wb.createSheet("TODAS");
                    Tools.styleSheetCityER(wb, allSheet);
                    int allEntries = 1;

                    int totalCities = cities.size();
                    int actualCity = 1;
                    DecimalFormat df = new DecimalFormat("#.##");
                    df.setRoundingMode(RoundingMode.CEILING);

                    for ( String city: cities) {
                        Location location = Requester.requestCity(city, country);

                        Sheet sheetCity = wb.createSheet(city);
                        Tools.styleSheetCityER(wb, sheetCity);

                        allEntries = Tools.newCity(location, sheetCity, allSheet, allEntries);
                        float percentatge = ((float)actualCity / totalCities) * 100;
                        System.out.println(" -------- " + df.format(percentatge) + "% --------" + System.lineSeparator());
                        actualCity++;
                    }

                    wb.write(fileOut);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Api Key not found!");
        }

    }

    private static CitiesDir initDir() {
        CitiesDir citiesDir = new CitiesDir();
        citiesDir.init_countries();
        citiesDir.init_country_Spain();
        citiesDir.init_Spain_region_Barcelona();
        return citiesDir;
    }

    public static void getApiKey(String filepath) throws FileNotFoundException {
        File myObj = new File(filepath);
        Scanner myReader = null;
        myReader = new Scanner(myObj);
        String data = myReader.nextLine();
        System.out.println(data);
        Tools.AND_API_KEY += data;
    }
}
