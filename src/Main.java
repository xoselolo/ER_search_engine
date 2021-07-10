import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import javax.tools.Tool;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final String BASE_OUT_PATH = "research_10_07_2021/";

    public static void main(String[] args)  {

        try {
            getApiKey(args[0]);

            try{

                CitiesDir citiesDir = initDir();
                Tools.initAllER();
                String country = "Spain";


                ArrayList<String> regions = new ArrayList<String>(
                        Arrays.asList(
                                "Barcelona", "Girona", "Lleida", "Tarragona",
                                "Madrid",
                                "Valencia", "Castellon", "Alicante",
                                "Mallorca", "Menorca", "Ibiza",
                                "Navarra",
                                "Sevilla", "Almeria", "Jaen", "Granada", "Cordoba", "Malaga", "Cadiz", "Huelva" ,
                                "Bizkaia", "Guipuzcoa", "Alava",
                                "LaRioja",
                                "Murcia",
                                "Zaragoza", "Huesca", "Teruel",
                                "Lugo", "Orense", "Pontevedra", "ACoruna",
                                "Asturias",
                                "Cantabria",
                                "Soria", "Burgos", "Segovia", "Palencia", "Valladolid", "Avila", "Leon", "Zamora", "Salamanca",
                                "Caceres", "Badajoz",
                                "Guadalajara", "Cuenca", "Albacete", "Toledo", "CiudadReal",
                                "Tenerife", "GranCanaria", "LaGomera", "LaPalma", "ElHierro", "Fuerteventura", "Lanzarote"
                        )
                );

                try{

                    for (String reg : regions){
                        ArrayList<String> cities = citiesDir.getCountryRegionCities(country, reg);

                        // Creamos Excel
                        Workbook wb = new HSSFWorkbook();
                        OutputStream fileOut = new FileOutputStream(BASE_OUT_PATH + "EscapeRooms_" + country + "_prov_" + reg + ".xls");

                        Sheet allSheet = wb.createSheet("TODAS");
                        Tools.styleSheetCityER(wb, allSheet);
                        int allEntries = 1;

                        int totalCities = cities.size();
                        int actualCity = 1;
                        DecimalFormat df = new DecimalFormat("#.##");
                        df.setRoundingMode(RoundingMode.CEILING);

                        for ( String city: cities) {
                            if (city.compareTo("Valmaseda") == 0){
                                System.out.println("HEre is the error");
                            }
                            Location location = Requester.requestCity(city, country);

                            Sheet sheetCity = wb.createSheet(city);
                            Tools.styleSheetCityER(wb, sheetCity);

                            allEntries = Tools.newCity(location, sheetCity, allSheet, allEntries);
                            float percentatge = ((float)actualCity / totalCities) * 100;
                            System.out.println(" -------- " + df.format(percentatge) + "% --------" + System.lineSeparator());
                            actualCity++;
                        }

                        wb.write(fileOut);
                    }
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
        // Init countries
        citiesDir.init_countries();
        // country: Spain
        citiesDir.init_country_Spain();
        //  catalunya
        citiesDir.init_Spain_region_Barcelona();
        citiesDir.init_Spain_region_Girona();
        citiesDir.init_Spain_region_Lleida();
        citiesDir.init_Spain_region_Tarragona();
        // madrid
        citiesDir.init_Spain_region_Madrid();
        // comunitat valenciana
        citiesDir.init_Spain_region_Valencia();
        citiesDir.init_Spain_region_Castellon();
        citiesDir.init_Spain_region_Alicante();
        // islas baleares
        citiesDir.init_Spain_region_Ibiza();
        citiesDir.init_Spain_region_Mallorca();
        citiesDir.init_Spain_region_Menorca();
        // navarra
        citiesDir.init_Spain_region_Navarra();
        // andalucia
        citiesDir.init_Spain_region_Sevilla();
        citiesDir.init_Spain_region_Almeria();
        citiesDir.init_Spain_region_Jaen();
        citiesDir.init_Spain_region_Granada();
        citiesDir.init_Spain_region_Cordoba();
        citiesDir.init_Spain_region_Malaga();
        citiesDir.init_Spain_region_Cadiz();
        citiesDir.init_Spain_region_Huelva();
        // pais vasco
        citiesDir.init_Spain_region_Bizkaia();
        citiesDir.init_Spain_region_Guipuzcoa();
        citiesDir.init_Spain_region_Alava();
        // la rioja
        citiesDir.init_Spain_region_LaRioja();
        // murcia
        citiesDir.init_Spain_region_Murcia();
        // aragon
        citiesDir.init_Spain_region_Zaragoza();
        citiesDir.init_Spain_region_Huesca();
        citiesDir.init_Spain_region_Teruel();
        // Galicia
        citiesDir.init_Spain_region_Lugo();
        citiesDir.init_Spain_region_Orense();
        citiesDir.init_Spain_region_Pontevedra();
        citiesDir.init_Spain_region_ACoruna();
        // Asturias
        citiesDir.init_Spain_region_Asturias();
        // Cantabria
        citiesDir.init_Spain_region_Cantabria();
        // Castilla y Leon
        citiesDir.init_Spain_region_Soria();
        citiesDir.init_Spain_region_Burgos();
        citiesDir.init_Spain_region_Segovia();
        citiesDir.init_Spain_region_Palencia();
        citiesDir.init_Spain_region_Valladolid();
        citiesDir.init_Spain_region_Avila();
        citiesDir.init_Spain_region_Leon();
        citiesDir.init_Spain_region_Zamora();
        citiesDir.init_Spain_region_Salamanca();
        // Extremadura
        citiesDir.init_Spain_region_Caceres();
        citiesDir.init_Spain_region_Badajoz();
        // CASTILLA LA MANCHA
        citiesDir.init_Spain_region_Guadalajara();
        citiesDir.init_Spain_region_Cuenca();
        citiesDir.init_Spain_region_Albacete();
        citiesDir.init_Spain_region_Toledo();
        citiesDir.init_Spain_region_CiudadReal();
        // Canarias
        citiesDir.init_Spain_region_Tenerife();
        citiesDir.init_Spain_region_GranCanaria();
        citiesDir.init_Spain_region_LaGomera();
        citiesDir.init_Spain_region_LaPalma();
        citiesDir.init_Spain_region_ElHierro();
        citiesDir.init_Spain_region_Fuerteventura();
        citiesDir.init_Spain_region_Lanzarote();

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
