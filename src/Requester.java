import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class Requester {

    public static JSONObject requestER(double latitude, double longitude, int radius) throws IOException {
        String url =  Tools.createUrlFindER(latitude, longitude, radius);
        return Tools.readJsonFromUrl(url);
    }

    public static JSONObject requestER(double latitude, double longitude, int radius, String pageToken) throws IOException {
        String url =  Tools.createUrlFindER(latitude, longitude, radius, pageToken);
        return Tools.readJsonFromUrl(url);
    }

    public static Location requestCity(String city, String country) throws IOException {
        String url = Tools.createUrlFindCityLocation(city, country);
        JSONObject response = Tools.readJsonFromUrl(url);

        JSONArray resultsArray = response.getJSONArray("results");
        JSONObject onlyResult = resultsArray.getJSONObject(0);
        JSONObject geometry = onlyResult.getJSONObject("geometry");
        JSONObject location = geometry.getJSONObject("location");
        return new Location(location.getDouble("lat"), location.getDouble("lng"));
    }

    public static EscapeRoom requestERdetails(String place_id) throws IOException {
        String url = Tools.createUrlFindERdetails(place_id);
        JSONObject response = Tools.readJsonFromUrl(url);

        JSONObject result = response.getJSONObject("result");

        String phone;
        String name;
        Float rating;
        String vicinity;
        String website;
        String business_status;
        String schedule[] = new String[7];

        try{
            business_status = result.getString("business_status");
        }catch (Exception e){
            business_status = null;
        }
        try{
                phone = result.getString("international_phone_number");
        }catch (Exception e){
            phone = null;
        }
        try{
            name = result.getString("name");
        }catch (Exception e){
            name = null;
        }
        try{
            rating = result.getFloat("rating");
        }catch (Exception e){
            rating = null;
        }
        try{
            vicinity = result.getString("vicinity");
        }catch (Exception e){
            vicinity = null;
        }
        try{
            website = result.getString("website");
        }catch (Exception e){
            website = null;
        }
        try{
            if (business_status.compareTo("OPERATIONAL") == 0){
                try{
                    JSONArray jsonSchedule = result.getJSONObject("opening_hours").getJSONArray("weekday_text");
                    for (int i = 0; i < jsonSchedule.length(); i++){
                        schedule[i] = jsonSchedule.getString(i);
                    }
                }catch (Exception e){
                    schedule = null;
                }
            }else{
                schedule = null;
            }
        }catch (Exception e){
            schedule = null;
        }

        return new EscapeRoom(place_id, name, vicinity, website, phone, rating, business_status, schedule);
    }
}
