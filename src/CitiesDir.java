import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CitiesDir{

    //https://www.roomescapes.es/provincias.php
    // COUNTRIES
    private HashMap<String, Boolean> countriesDir;

    // SPAIN
    //      SPAIN : regions
    private HashMap<String, Boolean> spain_Regions_Dir;
    //          SPAIN:BARCELONA : Cities
    private HashMap<String, String> spain_Barcelona_Dir;


    // ----------------- methods ----------------
    // Constructor
    public CitiesDir(){}

    public void init_countries(){
        // create countries directory
        countriesDir = new HashMap<String, Boolean>();
        // add Spain
        countriesDir.put("Spain", true);
    }

    public void init_country_Spain(){
        // create Spain regions directory
        spain_Regions_Dir = new HashMap<String, Boolean>();
        // add Barcelona region
        spain_Regions_Dir.put("Barcelona", true);
    }

    public void init_Spain_region_Barcelona(){
        // create Barcelona cities directory
        spain_Barcelona_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Barcelona_Dir.put("Barcelona", "Spain");
        spain_Barcelona_Dir.put("Mataro", "Spain");
        spain_Barcelona_Dir.put("Granollers", "Spain");
        spain_Barcelona_Dir.put("Manresa", "Spain");
        spain_Barcelona_Dir.put("Sabadell", "Spain");
        spain_Barcelona_Dir.put("Hospitalet de Llobregat", "Spain");
        spain_Barcelona_Dir.put("Vic", "Spain");
        spain_Barcelona_Dir.put("Terrasa", "Spain");
        spain_Barcelona_Dir.put("Cornella de Llobregat", "Spain");
        spain_Barcelona_Dir.put("Badalona", "Spain");
        spain_Barcelona_Dir.put("Vilanova i la Geltru", "Spain");
        spain_Barcelona_Dir.put("Santa Coloma de Gramanet", "Spain");
        spain_Barcelona_Dir.put("Sitges", "Spain");
        spain_Barcelona_Dir.put("Masnou", "Spain");
        spain_Barcelona_Dir.put("Mollet del Valles", "Spain");
        spain_Barcelona_Dir.put("Pineda de Mar", "Spain");
        spain_Barcelona_Dir.put("Berga", "Spain");
        spain_Barcelona_Dir.put("Igualada", "Spain");
        spain_Barcelona_Dir.put("Sant Feliu de Llobregat", "Spain");
        spain_Barcelona_Dir.put("Gironella", "Spain");
        spain_Barcelona_Dir.put("Vilafranca del Penedes", "Spain");
        spain_Barcelona_Dir.put("Ripollet", "Spain");
        spain_Barcelona_Dir.put("Sallent", "Spain");
        spain_Barcelona_Dir.put("Les Fonts", "Spain");
        spain_Barcelona_Dir.put("Molins de Rei", "Spain");
        spain_Barcelona_Dir.put("Castellbisbal", "Spain");
        spain_Barcelona_Dir.put("Cerdanyola del Valles", "Spain");
        spain_Barcelona_Dir.put("Malgrat de Mar", "Spain");
        spain_Barcelona_Dir.put("Castelldefels", "Spain");
        spain_Barcelona_Dir.put("Palafolls", "Spain");
        spain_Barcelona_Dir.put("Sant Sadurni d'Anoia", "Spain");
        spain_Barcelona_Dir.put("Cercs", "Spain");
        spain_Barcelona_Dir.put("Canovellas", "Spain");
        spain_Barcelona_Dir.put("Sant Boi de Llobregat", "Spain");
        spain_Barcelona_Dir.put("Montcada i Reixac", "Spain");
        spain_Barcelona_Dir.put("Rubi", "Spain");
        spain_Barcelona_Dir.put("Alella", "Spain");
        spain_Barcelona_Dir.put("Palleja", "Spain");
        spain_Barcelona_Dir.put("Santa Susanna", "Spain");
        spain_Barcelona_Dir.put("Barbera del Valles", "Spain");
        spain_Barcelona_Dir.put("Manlleu", "Spain");
        spain_Barcelona_Dir.put("Olesa de Montserrat", "Spain");
        spain_Barcelona_Dir.put("Gava", "Spain");
        spain_Barcelona_Dir.put("Monistrol de Montserrat", "Spain");
        spain_Barcelona_Dir.put("Odena", "Spain");
        spain_Barcelona_Dir.put("El Prat de Llobregat", "Spain");
        spain_Barcelona_Dir.put("Tona", "Spain");
        spain_Barcelona_Dir.put("Sant Feliu de Codines", "Spain");
        spain_Barcelona_Dir.put("Arenys de Mar", "Spain");
        spain_Barcelona_Dir.put("Les Franqueses del Valles", "Spain");
        spain_Barcelona_Dir.put("Sant Joan de Vilatorrada", "Spain");
    }

    public ArrayList<String> getCountryRegionCities(String country, String region) throws Exception{
        ArrayList<String> countryCities = new ArrayList<String>();
        Iterator it = null;
        if (this.countryExists(country)){
            if (this.regionExistsInCountry(country, region)){
                switch (country){
                    case "Spain":
                        switch (region){
                            case "Barcelona": // todo: getBarcelonaCities method
                                it = spain_Barcelona_Dir.entrySet().iterator();
                                break;
                        }
                        break;
                }
            }else{
                System.out.println("Region not exists");
                throw new RegionNotExistsException(country, region);
            }
        }else{
            System.out.println("Country not exists");
            throw new CountryNotExistsException(country);
        }
        if (it == null){
            return null;
        }
        while (it.hasNext()){
            Map.Entry<String, String> pair = (Map.Entry<String, String>)it.next();
            if(pair.getValue().toLowerCase().compareTo(country.toLowerCase()) == 0){
                countryCities.add(pair.getKey());
            }
        }
        return countryCities;
    }


    private boolean countryExists(String country) {
        return countriesDir.get(country) != null;
    }

    private boolean regionExistsInCountry(String country, String region) {
        if (country.compareTo("Spain") == 0){
            return spain_Regions_Dir.get(region) != null;
        }
        return false;
    }
}
