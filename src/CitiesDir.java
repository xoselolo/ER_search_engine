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
    //          SPAIN:CATALUNYA : Cities
    private HashMap<String, String> spain_Barcelona_Dir;
    private HashMap<String, String> spain_Girona_Dir;
    private HashMap<String, String> spain_Lleida_Dir;
    private HashMap<String, String> spain_Tarragona_Dir;
    //          SPAIN:BILBAO : Cities
    private HashMap<String, String> spain_Bizkaia_Dir;
    private HashMap<String, String> spain_Guipuzcoa_Dir;
    private HashMap<String, String> spain_Alava_Dir;
    //          SPAIN:MADRID : Cities
    private HashMap<String, String> spain_Madrid_Dir;
    //          SPAIN:SEVILLA : Cities
    private HashMap<String, String> spain_Sevilla_Dir;
    private HashMap<String, String> spain_Almeria_Dir;
    private HashMap<String, String> spain_Jaen_Dir;
    private HashMap<String, String> spain_Granada_Dir;
    private HashMap<String, String> spain_Cordoba_Dir;
    private HashMap<String, String> spain_Malaga_Dir;
    private HashMap<String, String> spain_Cadiz_Dir;
    private HashMap<String, String> spain_Huelva_Dir;
    //          SPAIN:COMUNIDAD VALENCIANA : Cities
    private HashMap<String, String> spain_Valencia_Dir;
    private HashMap<String, String> spain_Castellon_Dir;
    private HashMap<String, String> spain_Alicante_Dir;
    //          SPAIN:ISLAS BALEARES : Cities
    private HashMap<String, String> spain_Mallorca_Dir;
    private HashMap<String, String> spain_Menorca_Dir;
    private HashMap<String, String> spain_Ibiza_Dir;
    //          SPAIN:COMUNIDAD FORAL DE NAVARRA : Cities
    private HashMap<String, String> spain_Navarra_Dir;
    //          SPAIN:LA RIOJA : Cities
    private HashMap<String, String> spain_LaRioja_Dir;
    //          SPAIN:MURCIA : Cities
    private HashMap<String, String> spain_Murcia_Dir;
    //          SPAIN:ARAGON : Cities
    private HashMap<String, String> spain_Zaragoza_Dir;
    private HashMap<String, String> spain_Huesca_Dir;
    private HashMap<String, String> spain_Teruel_Dir;
    //          SPAIN: CASTILLA LA MANCHA : Cities
    private HashMap<String, String> spain_Guadalajara_Dir;
    private HashMap<String, String> spain_Cuenca_Dir;
    private HashMap<String, String> spain_Albacete_Dir;
    private HashMap<String, String> spain_Toledo_Dir;
    private HashMap<String, String> spain_CiudadReal_Dir;
    //          SPAIN: CASTILLA Y LEON : Cities
    private HashMap<String, String> spain_Soria_Dir;
    private HashMap<String, String> spain_Burgos_Dir;
    private HashMap<String, String> spain_Segovia_Dir;
    private HashMap<String, String> spain_Palencia_Dir;
    private HashMap<String, String> spain_Valladolid_Dir;
    private HashMap<String, String> spain_Avila_Dir;
    private HashMap<String, String> spain_Leon_Dir;
    private HashMap<String, String> spain_Zamora_Dir;
    private HashMap<String, String> spain_Salamanca_Dir;
    //          SPAIN: CANTABRIA : Cities
    private HashMap<String, String> spain_Cantabria_Dir;
    //          SPAIN: ASTURIAS : Cities
    private HashMap<String, String> spain_Asturias_Dir;
    //          SPAIN: GALICIA : Cities
    private HashMap<String, String> spain_Lugo_Dir;
    private HashMap<String, String> spain_Orense_Dir;
    private HashMap<String, String> spain_ACoruna_Dir;
    private HashMap<String, String> spain_Pontevedra_Dir;
    //          SPAIN: EXTREMADURA : Cities
    private HashMap<String, String> spain_Caceres_Dir;
    private HashMap<String, String> spain_Badajoz_Dir;
    //          SPAIN: ISLAS CANARIAS : Cities
    private HashMap<String, String> spain_Tenerife_Dir;
    private HashMap<String, String> spain_GranCanarias_Dir;
    private HashMap<String, String> spain_LaGomera_Dir;
    private HashMap<String, String> spain_LaPalma_Dir;
    private HashMap<String, String> spain_ElHierro_Dir;
    private HashMap<String, String> spain_Fuerteventura_Dir;
    private HashMap<String, String> spain_Lanzarote_Dir;


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
        // add CATALUNYA region
        spain_Regions_Dir.put("Barcelona", true);
        spain_Regions_Dir.put("Girona", true);
        spain_Regions_Dir.put("Lleida", true);
        spain_Regions_Dir.put("Tarragona", true);
        // add MADRID region
        spain_Regions_Dir.put("Madrid", true);
        // add COMUNIDAD VALENCIANA region
        spain_Regions_Dir.put("Valencia", true);
        spain_Regions_Dir.put("Castellon", true);
        spain_Regions_Dir.put("Alicante", true);
        // add ISLAS BALEARES region
        spain_Regions_Dir.put("Mallorca", true);
        spain_Regions_Dir.put("Menorca", true);
        spain_Regions_Dir.put("Ibiza", true);
        // add NAVARRA region
        spain_Regions_Dir.put("Navarra", true);
        // add ANDALUCIA region
        spain_Regions_Dir.put("Sevilla", true);
        spain_Regions_Dir.put("Almeria", true);
        spain_Regions_Dir.put("Jaen", true);
        spain_Regions_Dir.put("Granada", true);
        spain_Regions_Dir.put("Cordoba", true);
        spain_Regions_Dir.put("Malaga", true);
        spain_Regions_Dir.put("Cadiz", true);
        spain_Regions_Dir.put("Huelva", true);
        // add PAIS VASCO region
        spain_Regions_Dir.put("Bizkaia", true);
        spain_Regions_Dir.put("Guipuzcoa", true);
        spain_Regions_Dir.put("Alava", true);
        // add LA RIOJA region
        spain_Regions_Dir.put("LaRioja", true);
        // add MURCIA region
        spain_Regions_Dir.put("Murcia", true);
        // add ARAGON region
        spain_Regions_Dir.put("Zaragoza", true);
        spain_Regions_Dir.put("Huesca", true);
        spain_Regions_Dir.put("Teruel", true);
        // add GALICIA region
        spain_Regions_Dir.put("Lugo", true);
        spain_Regions_Dir.put("Orense", true);
        spain_Regions_Dir.put("Pontevedra", true);
        spain_Regions_Dir.put("ACoruna", true);
        // add ASTURIAS region
        spain_Regions_Dir.put("Asturias", true);
        // add CANTABRIA region
        spain_Regions_Dir.put("Cantabria", true);
        // add CASTILLA Y LEON region
        spain_Regions_Dir.put("Soria", true);
        spain_Regions_Dir.put("Burgos", true);
        spain_Regions_Dir.put("Segovia", true);
        spain_Regions_Dir.put("Palencia", true);
        spain_Regions_Dir.put("Valladolid", true);
        spain_Regions_Dir.put("Avila", true);
        spain_Regions_Dir.put("Leon", true);
        spain_Regions_Dir.put("Zamora", true);
        spain_Regions_Dir.put("Salamanca", true);
        // add EXTREMADURA region
        spain_Regions_Dir.put("Caceres", true);
        spain_Regions_Dir.put("Badajoz", true);
        // add CASTILLA LA MANCHA region
        spain_Regions_Dir.put("Guadalajara", true);
        spain_Regions_Dir.put("Cuenca", true);
        spain_Regions_Dir.put("Albacete", true);
        spain_Regions_Dir.put("Toledo", true);
        spain_Regions_Dir.put("CiudadReal", true);
        // add CANARIAS region
        spain_Regions_Dir.put("Tenerife", true);
        spain_Regions_Dir.put("GranCanaria", true);
        spain_Regions_Dir.put("LaGomera", true);
        spain_Regions_Dir.put("LaPalma", true);
        spain_Regions_Dir.put("ElHierro", true);
        spain_Regions_Dir.put("Fuerteventura", true);
        spain_Regions_Dir.put("Lanzarote", true);
    }

    // CATALUNYA
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
    public void init_Spain_region_Girona(){
        // create Barcelona cities directory
        spain_Girona_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Girona_Dir.put("Girona", "Spain");
        spain_Girona_Dir.put("Lloret de Mar", "Spain");
        spain_Girona_Dir.put("Palamos", "Spain");
        spain_Girona_Dir.put("Figueras", "Spain");
        spain_Girona_Dir.put("Cadaques", "Spain");
        spain_Girona_Dir.put("La Junquera", "Spain");
        spain_Girona_Dir.put("L'Escala", "Spain");
        spain_Girona_Dir.put("Torroella de Montgri", "Spain");
        spain_Girona_Dir.put("Palafrugell", "Spain");
        spain_Girona_Dir.put("Palamos", "Spain");
        spain_Girona_Dir.put("Sant Feliu de Guixols", "Spain");
        spain_Girona_Dir.put("Bañolas", "Spain");
        spain_Girona_Dir.put("Camprodon", "Spain");
    }
    public void init_Spain_region_Lleida(){
        // create Barcelona cities directory
        spain_Lleida_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Lleida_Dir.put("Lleida", "Spain");
        spain_Lleida_Dir.put("Mollerusa", "Spain");
        spain_Lleida_Dir.put("Tarrega", "Spain");
        spain_Lleida_Dir.put("Balaguer", "Spain");
        spain_Lleida_Dir.put("La Seu d'Urgell", "Spain");
        spain_Lleida_Dir.put("Borjas Blancas", "Spain");
        spain_Lleida_Dir.put("Alcarras", "Spain");
        spain_Lleida_Dir.put("Almacellas", "Spain");
        spain_Lleida_Dir.put("Agramunt", "Spain");
        spain_Lleida_Dir.put("Artesa de Segre", "Spain");
        spain_Lleida_Dir.put("Cervera", "Spain");
        spain_Lleida_Dir.put("Guisona", "Spain");
        spain_Lleida_Dir.put("Solsona", "Spain");
        spain_Lleida_Dir.put("Oliana", "Spain");
        spain_Lleida_Dir.put("Rialp", "Spain");

    }
    public void init_Spain_region_Tarragona(){
        // create Barcelona cities directory
        spain_Tarragona_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Tarragona_Dir.put("Tarragona", "Spain");
        spain_Tarragona_Dir.put("Reus", "Spain");
        spain_Tarragona_Dir.put("Amposta", "Spain");
        spain_Tarragona_Dir.put("Cambrils", "Spain");
        spain_Tarragona_Dir.put("La Senia", "Spain");
        spain_Tarragona_Dir.put("L'Ametlla de Mar", "Spain");
        spain_Tarragona_Dir.put("Horta de San Juan", "Spain");
        spain_Tarragona_Dir.put("Grandesa", "Spain");
        spain_Tarragona_Dir.put("Mora de Ebro", "Spain");
        spain_Tarragona_Dir.put("Flix", "Spain");
        spain_Tarragona_Dir.put("Valls", "Spain");
        spain_Tarragona_Dir.put("El Vendrell", "Spain");
        spain_Tarragona_Dir.put("Sarral", "Spain");
    }

    public void init_Spain_region_Madrid(){
        // create Barcelona cities directory
        spain_Madrid_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Madrid_Dir.put("Madrid", "Spain");
        spain_Madrid_Dir.put("Mostoles", "Spain");
        spain_Madrid_Dir.put("Alcorcon", "Spain");
        spain_Madrid_Dir.put("Coslada", "Spain");
        spain_Madrid_Dir.put("Alcala de Henares", "Spain");
        spain_Madrid_Dir.put("Rivas-Vaciamadrid", "Spain");
        spain_Madrid_Dir.put("Leganes", "Spain");
        spain_Madrid_Dir.put("Getafe", "Spain");
        spain_Madrid_Dir.put("Boadilla del Monte", "Spain");
        spain_Madrid_Dir.put("Manzanares el Real", "Spain");
        spain_Madrid_Dir.put("Las Rozas", "Spain");
        spain_Madrid_Dir.put("Aranjuez", "Spain");
        spain_Madrid_Dir.put("Villaviciosa de Odon", "Spain");
        spain_Madrid_Dir.put("Parla", "Spain");
        spain_Madrid_Dir.put("Majadahonda", "Spain");
        spain_Madrid_Dir.put("Navalcarnero", "Spain");
        spain_Madrid_Dir.put("Torrejon de Ardoz", "Spain");
        spain_Madrid_Dir.put("Griñon", "Spain");
        spain_Madrid_Dir.put("Fuenlabrada", "Spain");
        spain_Madrid_Dir.put("San Sebastian de los Reyes", "Spain");
    }

    // COMUNIDAD VALENCIANA
    public void init_Spain_region_Valencia(){
        // create Barcelona cities directory
        spain_Valencia_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Valencia_Dir.put("Valencia", "Spain");
        spain_Valencia_Dir.put("Sagunto", "Spain");
        spain_Valencia_Dir.put("Alcira", "Spain");
        spain_Valencia_Dir.put("Gandia", "Spain");
        spain_Valencia_Dir.put("Onteniente", "Spain");
        spain_Valencia_Dir.put("Xativa", "Spain");
        spain_Valencia_Dir.put("Algemesi", "Spain");
        spain_Valencia_Dir.put("Oliva", "Spain");
        spain_Valencia_Dir.put("Requena", "Spain");
        spain_Valencia_Dir.put("Siete Aguas", "Spain");
        spain_Valencia_Dir.put("Buñol", "Spain");
        spain_Valencia_Dir.put("Utiel", "Spain");
        spain_Valencia_Dir.put("Villagordo de Cabriel", "Spain");
        spain_Valencia_Dir.put("Alfafar", "Spain");
        spain_Valencia_Dir.put("Aldaya", "Spain");
        spain_Valencia_Dir.put("Paterna", "Spain");
        spain_Valencia_Dir.put("Torrente", "Spain");
        spain_Valencia_Dir.put("Chera", "Spain");
    }
    public void init_Spain_region_Castellon(){
        // create Barcelona cities directory
        spain_Castellon_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Castellon_Dir.put("Castellon de la Plana", "Spain");
        spain_Castellon_Dir.put("Peniscola", "Spain");
        spain_Castellon_Dir.put("Benicarlo", "Spain");
        spain_Castellon_Dir.put("Villarreal", "Spain");
        spain_Castellon_Dir.put("Burricana", "Spain");
        spain_Castellon_Dir.put("Benicassim", "Spain");
        spain_Castellon_Dir.put("Torreblanca", "Spain");
        spain_Castellon_Dir.put("Vall de Uxo", "Spain");
        spain_Castellon_Dir.put("Segorbe", "Spain");
        spain_Castellon_Dir.put("Jerica", "Spain");
    }
    public void init_Spain_region_Alicante(){
        // create Barcelona cities directory
        spain_Alicante_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Alicante_Dir.put("Alicante", "Spain");
        spain_Alicante_Dir.put("Denia", "Spain");
        spain_Alicante_Dir.put("Javea", "Spain");
        spain_Alicante_Dir.put("Calpe", "Spain");
        spain_Alicante_Dir.put("Benidorm", "Spain");
        spain_Alicante_Dir.put("Alcoy", "Spain");
        spain_Alicante_Dir.put("Elche", "Spain");
        spain_Alicante_Dir.put("Santa Pola", "Spain");
        spain_Alicante_Dir.put("Torrevieja", "Spain");
        spain_Alicante_Dir.put("Orihuela", "Spain");
        spain_Alicante_Dir.put("Campello", "Spain");
        spain_Alicante_Dir.put("Villajoyosa", "Spain");
        spain_Alicante_Dir.put("Elda", "Spain");
        spain_Alicante_Dir.put("Novelda", "Spain");
        spain_Alicante_Dir.put("Villena", "Spain");
        spain_Alicante_Dir.put("Cocentaina", "Spain");
        spain_Alicante_Dir.put("Altea", "Spain");
    }

    // ANDALUCIA
    public void init_Spain_region_Sevilla(){
        // create Barcelona cities directory
        spain_Sevilla_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Sevilla_Dir.put("Sevilla", "Spain");
        spain_Sevilla_Dir.put("Gines", "Spain");
        spain_Sevilla_Dir.put("Utrera", "Spain");
        spain_Sevilla_Dir.put("Bormujos", "Spain");
        spain_Sevilla_Dir.put("Carmona", "Spain");
        spain_Sevilla_Dir.put("Montequinto", "Spain");
        spain_Sevilla_Dir.put("Alcala de Guadaira", "Spain");
        spain_Sevilla_Dir.put("Tomares", "Spain");
        spain_Sevilla_Dir.put("Dos Hermanas", "Spain");
        spain_Sevilla_Dir.put("Osuna", "Spain");
        spain_Sevilla_Dir.put("Ecija", "Spain");
        spain_Sevilla_Dir.put("El Viso del Alcor", "Spain");
        spain_Sevilla_Dir.put("Moron de la Frontera", "Spain");
        spain_Sevilla_Dir.put("Montellano", "Spain");
        spain_Sevilla_Dir.put("Las Cabezas de San Juan", "Spain");
        spain_Sevilla_Dir.put("Lebrija", "Spain");
    }
    public void init_Spain_region_Cadiz(){
        // create Barcelona cities directory
        spain_Cadiz_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Cadiz_Dir.put("Cadiz", "Spain");
        spain_Cadiz_Dir.put("Jerez de la Frontera", "Spain");
        spain_Cadiz_Dir.put("Chiclana de la Frontera", "Spain");
        spain_Cadiz_Dir.put("Sanlucar de Barrameda", "Spain");
        spain_Cadiz_Dir.put("Trebujena", "Spain");
        spain_Cadiz_Dir.put("El Puerto de Sta Maria", "Spain");
        spain_Cadiz_Dir.put("San Fernando", "Spain");
        spain_Cadiz_Dir.put("Conil de la Frontera", "Spain");
        spain_Cadiz_Dir.put("Barbate", "Spain");
        spain_Cadiz_Dir.put("Zahara de los Atunes", "Spain");
        spain_Cadiz_Dir.put("Los Barrios", "Spain");
        spain_Cadiz_Dir.put("Alcalá de los Gazules", "Spain");
        spain_Cadiz_Dir.put("Arcos de la Frontera", "Spain");
        spain_Cadiz_Dir.put("Villamartin", "Spain");
        spain_Cadiz_Dir.put("Rota", "Spain");
        spain_Cadiz_Dir.put("Huelvacar", "Spain");
    }
    public void init_Spain_region_Huelva(){
        // create Barcelona cities directory
        spain_Huelva_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Huelva_Dir.put("Huelva", "Spain");
        spain_Huelva_Dir.put("Punta Umbria", "Spain");
        spain_Huelva_Dir.put("Lepe", "Spain");
        spain_Huelva_Dir.put("Ayamonte", "Spain");
        spain_Huelva_Dir.put("La Palma del Condado", "Spain");
        spain_Huelva_Dir.put("Almonte", "Spain");
        spain_Huelva_Dir.put("Valverde del Camino", "Spain");
        spain_Huelva_Dir.put("Aracena", "Spain");
        spain_Huelva_Dir.put("Cortegana", "Spain");
        spain_Huelva_Dir.put("Aroche", "Spain");
        spain_Huelva_Dir.put("Palos de la Frontera", "Spain");
        spain_Huelva_Dir.put("Moguer", "Spain");
        spain_Huelva_Dir.put("San Juan del Puerto", "Spain");
        spain_Huelva_Dir.put("Aljarque", "Spain");
        spain_Huelva_Dir.put("Gibraleon", "Spain");
    }
    public void init_Spain_region_Cordoba(){
        // create Barcelona cities directory
        spain_Cordoba_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Cordoba_Dir.put("Cordoba", "Spain");
        spain_Cordoba_Dir.put("Hinojosa del Duque", "Spain");
        spain_Cordoba_Dir.put("Pozoblanco", "Spain");
        spain_Cordoba_Dir.put("Pelarroya-Pueblonuevo", "Spain");
        spain_Cordoba_Dir.put("Villanueva de Cordoba", "Spain");
        spain_Cordoba_Dir.put("Montoro", "Spain");
        spain_Cordoba_Dir.put("Palma del Rio", "Spain");
        spain_Cordoba_Dir.put("Montilla", "Spain");
        spain_Cordoba_Dir.put("Lucena", "Spain");
        spain_Cordoba_Dir.put("Puente Genil", "Spain");
        spain_Cordoba_Dir.put("Cierro Muriano", "Spain");
        spain_Cordoba_Dir.put("Villafranca de Cordoba", "Spain");
        spain_Cordoba_Dir.put("La Huelga", "Spain");
        spain_Cordoba_Dir.put("El Alcaide", "Spain");
        spain_Cordoba_Dir.put("Almodovar del Rio", "Spain");
        spain_Cordoba_Dir.put("Alcolea", "Spain");
    }
    public void init_Spain_region_Malaga(){
        // create Barcelona cities directory
        spain_Malaga_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Malaga_Dir.put("Malaga", "Spain");
        spain_Malaga_Dir.put("Rincon de Victoria", "Spain");
        spain_Malaga_Dir.put("Torre del Mar", "Spain");
        spain_Malaga_Dir.put("Velez-Malaga", "Spain");
        spain_Malaga_Dir.put("Torrox", "Spain");
        spain_Malaga_Dir.put("Nerja", "Spain");
        spain_Malaga_Dir.put("Villanueva del Trabuco", "Spain");
        spain_Malaga_Dir.put("Archidona", "Spain");
        spain_Malaga_Dir.put("Antequera", "Spain");
        spain_Malaga_Dir.put("Mollina", "Spain");
        spain_Malaga_Dir.put("Ronda", "Spain");
        spain_Malaga_Dir.put("Estepona", "Spain");
        spain_Malaga_Dir.put("Casares", "Spain");
        spain_Malaga_Dir.put("Manilva", "Spain");
        spain_Malaga_Dir.put("Marbella", "Spain");
        spain_Malaga_Dir.put("Fuengirola", "Spain");
        spain_Malaga_Dir.put("Benalmadena", "Spain");
        spain_Malaga_Dir.put("Torremolinos", "Spain");
        spain_Malaga_Dir.put("Alhaurin de la Torre", "Spain");
        spain_Malaga_Dir.put("Cartama", "Spain");
        spain_Malaga_Dir.put("Casapalma", "Spain");
    }
    public void init_Spain_region_Granada(){
        // create Barcelona cities directory
        spain_Granada_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Granada_Dir.put("Granada", "Spain");
        spain_Granada_Dir.put("Motril", "Spain");
        spain_Granada_Dir.put("Guadix", "Spain");
        spain_Granada_Dir.put("Baza", "Spain");
        spain_Granada_Dir.put("Loja", "Spain");
        spain_Granada_Dir.put("Huetor", "Spain");
        spain_Granada_Dir.put("Tajar", "Spain");
        spain_Granada_Dir.put("Santa Fe", "Spain");
        spain_Granada_Dir.put("Albolote", "Spain");
        spain_Granada_Dir.put("Benalua", "Spain");
        spain_Granada_Dir.put("Castell de Ferro", "Spain");
        spain_Granada_Dir.put("Cullar", "Spain");
        spain_Granada_Dir.put("Las Gabias", "Spain");
        spain_Granada_Dir.put("Alfacar", "Spain");
    }
    public void init_Spain_region_Almeria(){
        // create Barcelona cities directory
        spain_Almeria_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Almeria_Dir.put("Almeria", "Spain");
        spain_Almeria_Dir.put("El Ejido", "Spain");
        spain_Almeria_Dir.put("Roquetas de Mar", "Spain");
        spain_Almeria_Dir.put("Mojacar", "Spain");
        spain_Almeria_Dir.put("Albox", "Spain");
        spain_Almeria_Dir.put("Cuevas de Almanzora", "Spain");
        spain_Almeria_Dir.put("Huercal-Overa", "Spain");
        spain_Almeria_Dir.put("Campohermoso", "Spain");
        spain_Almeria_Dir.put("Tabernas", "Spain");
        spain_Almeria_Dir.put("Gergal", "Spain");
        spain_Almeria_Dir.put("Adra", "Spain");
        spain_Almeria_Dir.put("Fiñana", "Spain");
        spain_Almeria_Dir.put("Retamar", "Spain");
        spain_Almeria_Dir.put("La Cañada", "Spain");
        spain_Almeria_Dir.put("Huercal de Almeria", "Spain");
    }
    public void init_Spain_region_Jaen(){
        // create Barcelona cities directory
        spain_Jaen_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Jaen_Dir.put("Jaen", "Spain");
        spain_Jaen_Dir.put("Ubeda", "Spain");
        spain_Jaen_Dir.put("Baeza", "Spain");
        spain_Jaen_Dir.put("Andujar", "Spain");
        spain_Jaen_Dir.put("Linares", "Spain");
        spain_Jaen_Dir.put("Alcala la Real", "Spain");
        spain_Jaen_Dir.put("Cazorla", "Spain");
        spain_Jaen_Dir.put("Bailen", "Spain");
        spain_Jaen_Dir.put("Guarroman", "Spain");
        spain_Jaen_Dir.put("Mancha Real", "Spain");
        spain_Jaen_Dir.put("Torreperogil", "Spain");
    }

    // PAIS VASCO
    public void init_Spain_region_Bizkaia(){
        // create Barcelona cities directory
        spain_Bizkaia_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Bizkaia_Dir.put("Bilbao", "Spain");
        spain_Bizkaia_Dir.put("Barakaldo", "Spain");
        spain_Bizkaia_Dir.put("Ondarroa", "Spain");
        spain_Bizkaia_Dir.put("Guernica-Luno", "Spain");
        spain_Bizkaia_Dir.put("Getxo", "Spain");
        spain_Bizkaia_Dir.put("Portugalete", "Spain");
        spain_Bizkaia_Dir.put("Ermua", "Spain");
        spain_Bizkaia_Dir.put("Santurtzi", "Spain");
        spain_Bizkaia_Dir.put("Besauri", "Spain");
        spain_Bizkaia_Dir.put("Durango", "Spain");
        spain_Bizkaia_Dir.put("Galdacano", "Spain");
        spain_Bizkaia_Dir.put("Arrigorriaga", "Spain");
        spain_Bizkaia_Dir.put("Orozco", "Spain");
        spain_Bizkaia_Dir.put("Sodupe", "Spain");
        spain_Bizkaia_Dir.put("Mimetiz", "Spain");
        spain_Bizkaia_Dir.put("Munguia", "Spain");
    }
    public void init_Spain_region_Guipuzcoa(){
        // create Barcelona cities directory
        spain_Guipuzcoa_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Guipuzcoa_Dir.put("San Sebastian", "Spain");
        spain_Guipuzcoa_Dir.put("Hernani", "Spain");
        spain_Guipuzcoa_Dir.put("Zarauz", "Spain");
        spain_Guipuzcoa_Dir.put("Eibar", "Spain");
        spain_Guipuzcoa_Dir.put("Vergara", "Spain");
        spain_Guipuzcoa_Dir.put("Mondragon", "Spain");
        spain_Guipuzcoa_Dir.put("Beasain", "Spain");
        spain_Guipuzcoa_Dir.put("Tolosa", "Spain");
        spain_Guipuzcoa_Dir.put("Andoain", "Spain");
        spain_Guipuzcoa_Dir.put("Irun", "Spain");
    }
    public void init_Spain_region_Alava(){
        // create Barcelona cities directory
        spain_Alava_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Alava_Dir.put("Amurrio", "Spain");
        spain_Alava_Dir.put("Langraiz", "Spain");
        spain_Alava_Dir.put("Etxabbari Ibiña", "Spain");
        spain_Alava_Dir.put("Alegria", "Spain");
        spain_Alava_Dir.put("Saseta", "Spain");
        spain_Alava_Dir.put("Bernedo", "Spain");
        spain_Alava_Dir.put("Araia", "Spain");
        spain_Alava_Dir.put("San Roman de San Millan", "Spain");
        spain_Alava_Dir.put("Laguardia", "Spain");
        spain_Alava_Dir.put("Oyon", "Spain");
        spain_Alava_Dir.put("Bastida", "Spain");
        spain_Alava_Dir.put("Berantevilla", "Spain");
        spain_Alava_Dir.put("Rivabellosa", "Spain");
        spain_Alava_Dir.put("Vitoria-Gasteiz", "Spain");
        spain_Alava_Dir.put("Abechuco", "Spain");
        spain_Alava_Dir.put("Villanañe", "Spain");
        spain_Alava_Dir.put("Delika", "Spain");
        spain_Alava_Dir.put("Llodio", "Spain");
    }

    // LA RIOJA
    public void init_Spain_region_LaRioja(){
        // create Barcelona cities directory
        spain_LaRioja_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_LaRioja_Dir.put("Logroño", "Spain");
        spain_LaRioja_Dir.put("Haro", "Spain");
        spain_LaRioja_Dir.put("Santo Domingo de la Calzada", "Spain");
        spain_LaRioja_Dir.put("Najera", "Spain");
        spain_LaRioja_Dir.put("Calahorra", "Spain");
        spain_LaRioja_Dir.put("Lardero", "Spain");
        spain_LaRioja_Dir.put("Agoncillo", "Spain");
        spain_LaRioja_Dir.put("Lodosa", "Spain");
        spain_LaRioja_Dir.put("Alfaro", "Spain");
        spain_LaRioja_Dir.put("Autol", "Spain");
    }

    // MURCIA
    public void init_Spain_region_Murcia(){
        // create Barcelona cities directory
        spain_Murcia_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Murcia_Dir.put("Murcia", "Spain");
        spain_Murcia_Dir.put("Cartagena", "Spain");
        spain_Murcia_Dir.put("Lorca", "Spain");
        spain_Murcia_Dir.put("Caravaca de la Cruz", "Spain");
        spain_Murcia_Dir.put("Moratalla", "Spain");
        spain_Murcia_Dir.put("Molina de Segura", "Spain");
        spain_Murcia_Dir.put("Cieza", "Spain");
        spain_Murcia_Dir.put("Jumilla", "Spain");
        spain_Murcia_Dir.put("Yecla", "Spain");
        spain_Murcia_Dir.put("Bullas", "Spain");
        spain_Murcia_Dir.put("Puerto de Lubreras", "Spain");
        spain_Murcia_Dir.put("San Javier", "Spain");
        spain_Murcia_Dir.put("Fuente Alamo", "Spain");
        spain_Murcia_Dir.put("Torre-Pachecho", "Spain");
        spain_Murcia_Dir.put("Aguilas", "Spain");
    }

    // ARAGON
    public void init_Spain_region_Zaragoza(){
        // create Barcelona cities directory
        spain_Zaragoza_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Zaragoza_Dir.put("Zaragoza", "Spain");
        spain_Zaragoza_Dir.put("Pedrola", "Spain");
        spain_Zaragoza_Dir.put("Caspe", "Spain");
        spain_Zaragoza_Dir.put("Zuera", "Spain");
        spain_Zaragoza_Dir.put("Villanueva de Gallego", "Spain");
        spain_Zaragoza_Dir.put("Utebo", "Spain");
        spain_Zaragoza_Dir.put("Alagon", "Spain");
        spain_Zaragoza_Dir.put("El Burgo de Ebro", "Spain");
        spain_Zaragoza_Dir.put("Pina de Ebro", "Spain");
        spain_Zaragoza_Dir.put("Quinto", "Spain");
        spain_Zaragoza_Dir.put("Cuarte de Huerva", "Spain");
        spain_Zaragoza_Dir.put("La Muela", "Spain");
    }
    public void init_Spain_region_Huesca(){
        // create Barcelona cities directory
        spain_Huesca_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Huesca_Dir.put("Huesca", "Spain");
        spain_Huesca_Dir.put("Jaca", "Spain");
        spain_Huesca_Dir.put("Sabiñanigo", "Spain");
        spain_Huesca_Dir.put("Barbastro", "Spain");
        spain_Huesca_Dir.put("Monzon", "Spain");
        spain_Huesca_Dir.put("Binefar", "Spain");
        spain_Huesca_Dir.put("Nueno", "Spain");
        spain_Huesca_Dir.put("Arguis", "Spain");
        spain_Huesca_Dir.put("Loarre", "Spain");
        spain_Huesca_Dir.put("Almudevar", "Spain");
        spain_Huesca_Dir.put("Taradienta", "Spain");
        spain_Huesca_Dir.put("Berbegal", "Spain");
        spain_Huesca_Dir.put("Alquezar", "Spain");
        spain_Huesca_Dir.put("Tamarite de Litera", "Spain");
        spain_Huesca_Dir.put("Benabarre", "Spain");
        spain_Huesca_Dir.put("Graus", "Spain");
        spain_Huesca_Dir.put("Bielsa", "Spain");
        spain_Huesca_Dir.put("Benasque", "Spain");
    }
    public void init_Spain_region_Teruel(){
        // create Barcelona cities directory
        spain_Teruel_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Teruel_Dir.put("Teruel", "Spain");
        spain_Teruel_Dir.put("Calamocha", "Spain");
        spain_Teruel_Dir.put("Alcañiz", "Spain");
        spain_Teruel_Dir.put("Cella", "Spain");
        spain_Teruel_Dir.put("Villarquemado", "Spain");
        spain_Teruel_Dir.put("Alfambra", "Spain");
        spain_Teruel_Dir.put("Cedrillas", "Spain");
        spain_Teruel_Dir.put("La Puebla de Valverde", "Spain");
        spain_Teruel_Dir.put("Sarrion", "Spain");
        spain_Teruel_Dir.put("Mora de Rubielos", "Spain");
        spain_Teruel_Dir.put("Rubielos de Mora", "Spain");
        spain_Teruel_Dir.put("Villafranca del Campo", "Spain");
        spain_Teruel_Dir.put("Monreal del Campo", "Spain");
        spain_Teruel_Dir.put("Caminreal", "Spain");
        spain_Teruel_Dir.put("Anento", "Spain");
        spain_Teruel_Dir.put("Daroca", "Spain");
        spain_Teruel_Dir.put("Veldealgorfa", "Spain");
        spain_Teruel_Dir.put("Valijunquera", "Spain");
    }

    // ISLAS BALEARES
    public void init_Spain_region_Mallorca(){
        // create Barcelona cities directory
        spain_Mallorca_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Mallorca_Dir.put("Palma", "Spain");
        spain_Mallorca_Dir.put("Alcudia", "Spain");
        spain_Mallorca_Dir.put("Inca", "Spain");
        spain_Mallorca_Dir.put("Calvia", "Spain");
        spain_Mallorca_Dir.put("Santa Ponsa", "Spain");
        spain_Mallorca_Dir.put("Manacor", "Spain");
        spain_Mallorca_Dir.put("Mallorca", "Spain");
    }
    public void init_Spain_region_Menorca(){
        // create Barcelona cities directory
        spain_Menorca_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Menorca_Dir.put("Ciudadela de Menorca", "Spain");
        spain_Menorca_Dir.put("Es Mercadal", "Spain");
        spain_Menorca_Dir.put("Menorca", "Spain");
        spain_Menorca_Dir.put("Mao-Mahon", "Spain");
        spain_Menorca_Dir.put("San Luis", "Spain");
    }
    public void init_Spain_region_Ibiza(){
        // create Barcelona cities directory
        spain_Ibiza_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Ibiza_Dir.put("Ibiza", "Spain");
        spain_Ibiza_Dir.put("Formentera", "Spain");
        spain_Ibiza_Dir.put("Sabta Eulalia del Rio", "Spain");
        spain_Ibiza_Dir.put("San Anotnio Abad", "Spain");
        spain_Ibiza_Dir.put("San Jose", "Spain");
    }

    // NAVARRA
    public void init_Spain_region_Navarra(){
        // create Barcelona cities directory
        spain_Navarra_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Navarra_Dir.put("Pamplona", "Spain");
        spain_Navarra_Dir.put("Estella", "Spain");
        spain_Navarra_Dir.put("Tafalla", "Spain");
        spain_Navarra_Dir.put("Tudela", "Spain");
        spain_Navarra_Dir.put("Olite", "Spain");
        spain_Navarra_Dir.put("Alsasua", "Spain");
        spain_Navarra_Dir.put("Elizondo", "Spain");
        spain_Navarra_Dir.put("Burguete", "Spain");
        spain_Navarra_Dir.put("Valcarlos", "Spain");
        spain_Navarra_Dir.put("Lumbier", "Spain");
        spain_Navarra_Dir.put("Ribaforada", "Spain");
        spain_Navarra_Dir.put("Corella", "Spain");
        spain_Navarra_Dir.put("Cintruenigo", "Spain");
    }

    // CANTABRIA *******************************************
    public void init_Spain_region_Cantabria(){
        // create Barcelona cities directory
        spain_Cantabria_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Cantabria_Dir.put("Santander", "Spain");
        spain_Cantabria_Dir.put("Torrelavega", "Spain");
        spain_Cantabria_Dir.put("Laredo", "Spain");
        spain_Cantabria_Dir.put("Castro Urdiales", "Spain");
        spain_Cantabria_Dir.put("Reinosa", "Spain");
        spain_Cantabria_Dir.put("San Vicente de la Barquera", "Spain");
        spain_Cantabria_Dir.put("Cabezon de la Sal", "Spain");
        spain_Cantabria_Dir.put("Suances", "Spain");
        spain_Cantabria_Dir.put("Ramales de la Victoria", "Spain");
        spain_Cantabria_Dir.put("Santoña", "Spain");
        spain_Cantabria_Dir.put("Potes", "Spain");
        spain_Cantabria_Dir.put("Santa Cruz de Bezana", "Spain");
    }

    // ASTURIAS
    public void init_Spain_region_Asturias(){
        // create Barcelona cities directory
        spain_Asturias_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Asturias_Dir.put("Oviedo", "Spain");
        spain_Asturias_Dir.put("Aviles", "Spain");
        spain_Asturias_Dir.put("Gijon", "Spain");
        spain_Asturias_Dir.put("Llanes", "Spain");
        spain_Asturias_Dir.put("Villaviciosa", "Spain");
        spain_Asturias_Dir.put("Cangas de Onis", "Spain");
        spain_Asturias_Dir.put("Ribadesella", "Spain");
        spain_Asturias_Dir.put("Langreo", "Spain");
        spain_Asturias_Dir.put("Mieres", "Spain");
        spain_Asturias_Dir.put("Cudillero", "Spain");
        spain_Asturias_Dir.put("Luarca", "Spain");
        spain_Asturias_Dir.put("Cangas del Narcea", "Spain");
    }

    // GALICIA
    public void init_Spain_region_ACoruna(){
        // create Barcelona cities directory
        spain_ACoruna_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_ACoruna_Dir.put("A Coruña", "Spain");
        spain_ACoruna_Dir.put("Ferrol", "Spain");
        spain_ACoruna_Dir.put("Oleiros", "Spain");
        spain_ACoruna_Dir.put("Betanzos", "Spain");
        spain_ACoruna_Dir.put("Santiago de Compostela", "Spain");
        spain_ACoruna_Dir.put("Noia", "Spain");
        spain_ACoruna_Dir.put("Riveira", "Spain");
        spain_ACoruna_Dir.put("Finisterre", "Spain");
        spain_ACoruna_Dir.put("Muxia", "Spain");
        spain_ACoruna_Dir.put("Culleredo", "Spain");
        spain_ACoruna_Dir.put("Arteijo", "Spain");
        spain_ACoruna_Dir.put("Carballo", "Spain");
        spain_ACoruna_Dir.put("Ames", "Spain");
    }
    public void init_Spain_region_Lugo(){
        // create Barcelona cities directory
        spain_Lugo_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Lugo_Dir.put("Lugo", "Spain");
        spain_Lugo_Dir.put("Vivero", "Spain");
        spain_Lugo_Dir.put("Burela", "Spain");
        spain_Lugo_Dir.put("Foz", "Spain");
        spain_Lugo_Dir.put("Ribadeo", "Spain");
        spain_Lugo_Dir.put("Villalba", "Spain");
        spain_Lugo_Dir.put("Fonsagrada", "Spain");
        spain_Lugo_Dir.put("Sarria", "Spain");
        spain_Lugo_Dir.put("Monforte de Lemos", "Spain");
        spain_Lugo_Dir.put("Chantada", "Spain");
        spain_Lugo_Dir.put("Puertomarin", "Spain");
    }
    public void init_Spain_region_Pontevedra(){
        // create Barcelona cities directory
        spain_Pontevedra_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Pontevedra_Dir.put("Pontevedra", "Spain");
        spain_Pontevedra_Dir.put("Vigo", "Spain");
        spain_Pontevedra_Dir.put("Redondela", "Spain");
        spain_Pontevedra_Dir.put("Bayona", "Spain");
        spain_Pontevedra_Dir.put("Porriño", "Spain");
        spain_Pontevedra_Dir.put("Lalin", "Spain");
        spain_Pontevedra_Dir.put("Carballino", "Spain");
    }
    public void init_Spain_region_Orense(){
        // create Barcelona cities directory
        spain_Orense_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Orense_Dir.put("Orense", "Spain");
        spain_Orense_Dir.put("Allariz", "Spain");
        spain_Orense_Dir.put("El Barco de Valdeorras", "Spain");
        spain_Orense_Dir.put("Verín", "Spain");
        spain_Orense_Dir.put("La Gudiña", "Spain");
        spain_Orense_Dir.put("Puebla de Trives", "Spain");
    }

    // CASTILLA Y LEON
    public void init_Spain_region_Leon(){
        // create Barcelona cities directory
        spain_Leon_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Leon_Dir.put("Leon", "Spain");
        spain_Leon_Dir.put("Ponferrada", "Spain");
        spain_Leon_Dir.put("Astorga", "Spain");
        spain_Leon_Dir.put("La Bañeza", "Spain");
        spain_Leon_Dir.put("Valencia de Don Juan", "Spain");
        spain_Leon_Dir.put("Sahagun", "Spain");
        spain_Leon_Dir.put("Onzonilla", "Spain");
    }
    public void init_Spain_region_Zamora(){
        // create Barcelona cities directory
        spain_Zamora_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Zamora_Dir.put("Zamora", "Spain");
        spain_Zamora_Dir.put("Benavente", "Spain");
        spain_Zamora_Dir.put("Villalpando", "Spain");
        spain_Zamora_Dir.put("Puebla de Sanabria", "Spain");
        spain_Zamora_Dir.put("Morales del Vino", "Spain");
    }
    public void init_Spain_region_Salamanca(){
        // create Barcelona cities directory
        spain_Salamanca_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Salamanca_Dir.put("Salamanca", "Spain");
        spain_Salamanca_Dir.put("Cdad. Rodrigo", "Spain");
        spain_Salamanca_Dir.put("Bejar", "Spain");
        spain_Salamanca_Dir.put("Peñaranda de Bracamonte", "Spain");
        spain_Salamanca_Dir.put("Tropas", "Spain");
        spain_Salamanca_Dir.put("Guijuelo", "Spain");
    }
    public void init_Spain_region_Palencia(){
        // create Barcelona cities directory
        spain_Palencia_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Palencia_Dir.put("Palencia", "Spain");
        spain_Palencia_Dir.put("Saldaña", "Spain");
        spain_Palencia_Dir.put("Guardo", "Spain");
        spain_Palencia_Dir.put("Aguilar del Campo", "Spain");
        spain_Palencia_Dir.put("Venta de Baños", "Spain");
        spain_Palencia_Dir.put("Herrera de Pisuerga", "Spain");
        spain_Palencia_Dir.put("Torquemada", "Spain");
        spain_Palencia_Dir.put("Quintana del Puente", "Spain");
        spain_Palencia_Dir.put("Alar del Rey", "Spain");
        spain_Palencia_Dir.put("Carrion de los Condes", "Spain");
    }
    public void init_Spain_region_Valladolid(){
        // create Barcelona cities directory
        spain_Valladolid_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Valladolid_Dir.put("Valladolid", "Spain");
        spain_Valladolid_Dir.put("Arroyo de la Encomienda", "Spain");
        spain_Valladolid_Dir.put("Laguna del Duero", "Spain");
        spain_Valladolid_Dir.put("Tordesillas", "Spain");
        spain_Valladolid_Dir.put("Medina del Campo", "Spain");
        spain_Valladolid_Dir.put("Rueda", "Spain");
        spain_Valladolid_Dir.put("Olmedo", "Spain");
        spain_Valladolid_Dir.put("Quintana de Onesimo", "Spain");
        spain_Valladolid_Dir.put("Villalón de Campos", "Spain");
    }
    public void init_Spain_region_Avila(){
        // create Barcelona cities directory
        spain_Avila_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Avila_Dir.put("Avila", "Spain");
        spain_Avila_Dir.put("Arevalo", "Spain");
        spain_Avila_Dir.put("San Pedro del Arroyo", "Spain");
        spain_Avila_Dir.put("Vicolzano", "Spain");
    }
    public void init_Spain_region_Segovia(){
        // create Barcelona cities directory
        spain_Segovia_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Segovia_Dir.put("Segovia", "Spain");
        spain_Segovia_Dir.put("Arevalo", "Spain");
        spain_Segovia_Dir.put("Sepulveda", "Spain");
        spain_Segovia_Dir.put("Cuellar", "Spain");
        spain_Segovia_Dir.put("Carbonero el Mayor", "Spain");
        spain_Segovia_Dir.put("Villacastin", "Spain");
    }
    public void init_Spain_region_Burgos(){
        // create Barcelona cities directory
        spain_Burgos_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Burgos_Dir.put("Burgos", "Spain");
        spain_Burgos_Dir.put("Aranda de Duero", "Spain");
        spain_Burgos_Dir.put("Lerma", "Spain");
        spain_Burgos_Dir.put("Briviesca", "Spain");
        spain_Burgos_Dir.put("Medina de Pomar", "Spain");
        spain_Burgos_Dir.put("Villagonzalo Perdernales", "Spain");
        spain_Burgos_Dir.put("Fuentespina", "Spain");
        spain_Burgos_Dir.put("Pancorbo", "Spain");
        spain_Burgos_Dir.put("Miranda de Ebro", "Spain");
    }
    public void init_Spain_region_Soria(){
        // create Barcelona cities directory
        spain_Soria_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Soria_Dir.put("Soria", "Spain");
        spain_Soria_Dir.put("El Burgo de Osma", "Spain");
        spain_Soria_Dir.put("Almazan", "Spain");
        spain_Soria_Dir.put("Calatañazor", "Spain");
        spain_Soria_Dir.put("Garray", "Spain");
        spain_Soria_Dir.put("Agreda", "Spain");
    }

    // CASTILLA LA MANCHA
    public void init_Spain_region_Guadalajara(){
        // create Barcelona cities directory
        spain_Guadalajara_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Guadalajara_Dir.put("Guadalajara", "Spain");
        spain_Guadalajara_Dir.put("Siguenza", "Spain");
        spain_Guadalajara_Dir.put("Molina de Aragon", "Spain");
        spain_Guadalajara_Dir.put("Alovera", "Spain");
        spain_Guadalajara_Dir.put("Algora", "Spain");
        spain_Guadalajara_Dir.put("Alcolea del Pinar", "Spain");
    }
    public void init_Spain_region_Cuenca(){
        // create Barcelona cities directory
        spain_Cuenca_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Cuenca_Dir.put("Cuenca", "Spain");
        spain_Cuenca_Dir.put("Tarancon", "Spain");
        spain_Cuenca_Dir.put("San Clemente", "Spain");
        spain_Cuenca_Dir.put("Montalbo", "Spain");
        spain_Cuenca_Dir.put("Belmonte", "Spain");
    }
    public void init_Spain_region_Toledo(){
        // create Barcelona cities directory
        spain_Toledo_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Toledo_Dir.put("Toledo", "Spain");
        spain_Toledo_Dir.put("Talavera de la Reina", "Spain");
        spain_Toledo_Dir.put("Consuegra", "Spain");
        spain_Toledo_Dir.put("Quintanar de la Orden", "Spain");
        spain_Toledo_Dir.put("Olias del Rey", "Spain");
        spain_Toledo_Dir.put("Añover de Tajo", "Spain");
        spain_Toledo_Dir.put("Yuncos", "Spain");
        spain_Toledo_Dir.put("Illescas", "Spain");
        spain_Toledo_Dir.put("Seseña", "Spain");
        spain_Toledo_Dir.put("Valmojado", "Spain");
        spain_Toledo_Dir.put("Santa Cruz del Retamar", "Spain");
        spain_Toledo_Dir.put("Torrijos", "Spain");
    }
    public void init_Spain_region_CiudadReal(){
        // create Barcelona cities directory
        spain_CiudadReal_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_CiudadReal_Dir.put("Ciudad Real", "Spain");
        spain_CiudadReal_Dir.put("Almagro", "Spain");
        spain_CiudadReal_Dir.put("Valdepeñas", "Spain");
        spain_CiudadReal_Dir.put("Puertollano", "Spain");
        spain_CiudadReal_Dir.put("Almaden", "Spain");
        spain_CiudadReal_Dir.put("Alcazar de San Juan", "Spain");
        spain_CiudadReal_Dir.put("Campo de Criptana", "Spain");
        spain_CiudadReal_Dir.put("Tormelloso", "Spain");
        spain_CiudadReal_Dir.put("Santa Cruz de Mudela", "Spain");
        spain_CiudadReal_Dir.put("Viso del Marques", "Spain");
    }
    public void init_Spain_region_Albacete(){
        // create Barcelona cities directory
        spain_Albacete_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Albacete_Dir.put("Albacete", "Spain");
        spain_Albacete_Dir.put("Villarrobledo", "Spain");
        spain_Albacete_Dir.put("Riopar", "Spain");
        spain_Albacete_Dir.put("Hellin", "Spain");
        spain_Albacete_Dir.put("Almansa", "Spain");
        spain_Albacete_Dir.put("Pozo Cañada", "Spain");
        spain_Albacete_Dir.put("Minateda", "Spain");
    }

    // EXTREMADURA
    public void init_Spain_region_Caceres(){
        // create Barcelona cities directory
        spain_Caceres_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Caceres_Dir.put("Caceres", "Spain");
        spain_Caceres_Dir.put("Moraleja", "Spain");
        spain_Caceres_Dir.put("Coria", "Spain");
        spain_Caceres_Dir.put("Plasencia", "Spain");
        spain_Caceres_Dir.put("Trujillo", "Spain");
        spain_Caceres_Dir.put("Hervas", "Spain");
        spain_Caceres_Dir.put("Miajadas", "Spain");
    }
    public void init_Spain_region_Badajoz(){
        // create Barcelona cities directory
        spain_Badajoz_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Badajoz_Dir.put("Badajoz", "Spain");
        spain_Badajoz_Dir.put("Talavera la Real", "Spain");
        spain_Badajoz_Dir.put("Albuquerque", "Spain");
        spain_Badajoz_Dir.put("Montijo", "Spain");
        spain_Badajoz_Dir.put("Merida", "Spain");
        spain_Badajoz_Dir.put("Olivenza", "Spain");
        spain_Badajoz_Dir.put("Almandralejo", "Spain");
        spain_Badajoz_Dir.put("Zafra", "Spain");
        spain_Badajoz_Dir.put("Villanueva de la Serena", "Spain");
        spain_Badajoz_Dir.put("Villafranca de los Barros", "Spain");
        spain_Badajoz_Dir.put("Monesterio", "Spain");
        spain_Badajoz_Dir.put("Llerena", "Spain");
        spain_Badajoz_Dir.put("Azuaga", "Spain");
        spain_Badajoz_Dir.put("Don Benito", "Spain");
        spain_Badajoz_Dir.put("Jerez de los Caballeros", "Spain");
    }

    // ISLAS CANARIAS
    public void init_Spain_region_LaPalma(){
        // create Barcelona cities directory
        spain_LaPalma_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_LaPalma_Dir.put("La Palma", "Spain");
        spain_LaPalma_Dir.put("Los Llanos", "Spain");
        spain_LaPalma_Dir.put("Tijarafe", "Spain");
        spain_LaPalma_Dir.put("Puntallana", "Spain");
        spain_LaPalma_Dir.put("Barlovento", "Spain");
        spain_LaPalma_Dir.put("Breña Baja", "Spain");
        spain_LaPalma_Dir.put("Los Canarios", "Spain");
    }
    public void init_Spain_region_Tenerife(){
        // create Barcelona cities directory
        spain_Tenerife_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Tenerife_Dir.put("Tenerife", "Spain");
        spain_Tenerife_Dir.put("Garachico", "Spain");
        spain_Tenerife_Dir.put("Adeje", "Spain");
        spain_Tenerife_Dir.put("Puerto de la Cruz", "Spain");
        spain_Tenerife_Dir.put("Santa Cruz de Tenerife", "Spain");
    }
    public void init_Spain_region_LaGomera(){
        // create Barcelona cities directory
        spain_LaGomera_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_LaGomera_Dir.put("La Gomera", "Spain");
        spain_LaGomera_Dir.put("Vallehermoso", "Spain");
        spain_LaGomera_Dir.put("San Sebastian de La Gomera", "Spain");
        spain_LaGomera_Dir.put("Valle Gran Rey", "Spain");
        spain_LaGomera_Dir.put("Playa de Santiago", "Spain");
    }
    public void init_Spain_region_ElHierro(){
        // create Barcelona cities directory
        spain_ElHierro_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_ElHierro_Dir.put("El Hierro", "Spain");
        spain_ElHierro_Dir.put("La Restringa", "Spain");
        spain_ElHierro_Dir.put("Las Puntas", "Spain");
        spain_ElHierro_Dir.put("Villa de Valverde", "Spain");
        spain_ElHierro_Dir.put("Taibique", "Spain");
        spain_ElHierro_Dir.put("Frontera", "Spain");
    }
    public void init_Spain_region_GranCanaria(){
        // create Barcelona cities directory
        spain_GranCanarias_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_GranCanarias_Dir.put("Gran Canaria", "Spain");
        spain_GranCanarias_Dir.put("Maspalomas", "Spain");
        spain_GranCanarias_Dir.put("Telde", "Spain");
        spain_GranCanarias_Dir.put("Vecindario", "Spain");
        spain_GranCanarias_Dir.put("Mogan", "Spain");
        spain_GranCanarias_Dir.put("Las Palmas de Gran Canaria", "Spain");
        spain_GranCanarias_Dir.put("Galdar", "Spain");
    }
    public void init_Spain_region_Fuerteventura(){
        // create Barcelona cities directory
        spain_Fuerteventura_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Fuerteventura_Dir.put("Fuerteventura", "Spain");
        spain_Fuerteventura_Dir.put("Corralejo", "Spain");
        spain_Fuerteventura_Dir.put("El Cotillo", "Spain");
        spain_Fuerteventura_Dir.put("Puerto del Rosario", "Spain");
        spain_Fuerteventura_Dir.put("Gran Tarajal", "Spain");
        spain_Fuerteventura_Dir.put("Costa Calma", "Spain");
        spain_Fuerteventura_Dir.put("Morro Jable", "Spain");
    }
    public void init_Spain_region_Lanzarote(){
        // create Barcelona cities directory
        spain_Lanzarote_Dir = new HashMap<String, String>();
        // add Barcelona cities
        spain_Lanzarote_Dir.put("Lanzarote", "Spain");
        spain_Lanzarote_Dir.put("Haria", "Spain");
        spain_Lanzarote_Dir.put("Arrecife", "Spain");
        spain_Lanzarote_Dir.put("Playa Blanca", "Spain");
    }

    public ArrayList<String> getCountryRegionCities(String country, String region) throws Exception{
        ArrayList<String> countryCities = new ArrayList<String>();
        Iterator it = null;
        if (this.countryExists(country)){
            if (this.regionExistsInCountry(country, region)){
                switch (country){
                    case "Spain":
                        switch (region){
                            // CATALUNYA
                            case "Barcelona": // todo: getBarcelonaCities method
                                it = spain_Barcelona_Dir.entrySet().iterator();
                                break;
                            case "Girona": // todo: getBarcelonaCities method
                                it = spain_Girona_Dir.entrySet().iterator();
                                break;
                            case "Lleida": // todo: getBarcelonaCities method
                                it = spain_Lleida_Dir.entrySet().iterator();
                                break;
                            case "Tarragona": // todo: getBarcelonaCities method
                                it = spain_Tarragona_Dir.entrySet().iterator();
                                break;

                            // MADRID
                            case "Madrid":
                                it = spain_Madrid_Dir.entrySet().iterator();
                                break;

                            // COMUNITAT VALENCIANA
                            case "Valencia":
                                it = spain_Valencia_Dir.entrySet().iterator();
                                break;
                            case "Castellon":
                                it = spain_Castellon_Dir.entrySet().iterator();
                                break;
                            case "Alicante":
                                it = spain_Alicante_Dir.entrySet().iterator();
                                break;

                            // ISLAS BALEARES
                            case "Mallorca":
                                it = spain_Mallorca_Dir.entrySet().iterator();
                                break;
                            case "Menorca":
                                it = spain_Menorca_Dir.entrySet().iterator();
                                break;
                            case "Ibiza":
                                it = spain_Ibiza_Dir.entrySet().iterator();
                                break;

                            // NAVARRA
                            case "Navarra":
                                it = spain_Navarra_Dir.entrySet().iterator();
                                break;

                            // ANDALUCIA
                            case "Sevilla":
                                it = spain_Sevilla_Dir.entrySet().iterator();
                                break;
                            case "Almeria":
                                it = spain_Almeria_Dir.entrySet().iterator();
                                break;
                            case "Jaen":
                                it = spain_Jaen_Dir.entrySet().iterator();
                                break;
                            case "Granada":
                                it = spain_Granada_Dir.entrySet().iterator();
                                break;
                            case "Cordoba":
                                it = spain_Cordoba_Dir.entrySet().iterator();
                                break;
                            case "Malaga":
                                it = spain_Malaga_Dir.entrySet().iterator();
                                break;
                            case "Cadiz":
                                it = spain_Cadiz_Dir.entrySet().iterator();
                                break;
                            case "Huelva":
                                it = spain_Huelva_Dir.entrySet().iterator();
                                break;

                            // PAIS VASCO
                            case "Bizkaia":
                                it = spain_Bizkaia_Dir.entrySet().iterator();
                                break;
                            case "Guipuzcoa":
                                it = spain_Guipuzcoa_Dir.entrySet().iterator();
                                break;
                            case "Alava":
                                it = spain_Alava_Dir.entrySet().iterator();
                                break;

                            // LA RIOJA
                            case "LaRioja":
                                it = spain_LaRioja_Dir.entrySet().iterator();
                                break;

                            // MURCIA
                            case "Murcia":
                                it = spain_Murcia_Dir.entrySet().iterator();
                                break;

                            // ARAGON
                            case "Zaragoza":
                                it = spain_Zaragoza_Dir.entrySet().iterator();
                                break;
                            case "Huesca":
                                it = spain_Huesca_Dir.entrySet().iterator();
                                break;
                            case "Teruel":
                                it = spain_Teruel_Dir.entrySet().iterator();
                                break;

                            // GALICIA
                            case "Lugo":
                                it = spain_Lugo_Dir.entrySet().iterator();
                                break;
                            case "Orense":
                                it = spain_Orense_Dir.entrySet().iterator();
                                break;
                            case "Pontevedra":
                                it = spain_Pontevedra_Dir.entrySet().iterator();
                                break;
                            case "ACoruna":
                                it = spain_ACoruna_Dir.entrySet().iterator();
                                break;

                            // ASTURIAS
                            case "Asturias":
                                it = spain_Asturias_Dir.entrySet().iterator();
                                break;

                            // CANTABRIA
                            case "Cantabria":
                                it = spain_Cantabria_Dir.entrySet().iterator();
                                break;

                            // CASTILLA Y LEON
                            case "Soria":
                                it = spain_Soria_Dir.entrySet().iterator();
                                break;
                            case "Burgos":
                                it = spain_Burgos_Dir.entrySet().iterator();
                                break;
                            case "Segovia":
                                it = spain_Segovia_Dir.entrySet().iterator();
                                break;
                            case "Palencia":
                                it = spain_Palencia_Dir.entrySet().iterator();
                                break;
                            case "Valladolid":
                                it = spain_Valladolid_Dir.entrySet().iterator();
                                break;
                            case "Avila":
                                it = spain_Avila_Dir.entrySet().iterator();
                                break;
                            case "Leon":
                                it = spain_Leon_Dir.entrySet().iterator();
                                break;
                            case "Zamora":
                                it = spain_Zamora_Dir.entrySet().iterator();
                                break;
                            case "Salamanca":
                                it = spain_Salamanca_Dir.entrySet().iterator();
                                break;

                            // EXTREMADURA
                            case "Caceres":
                                it = spain_Caceres_Dir.entrySet().iterator();
                                break;
                            case "Badajoz":
                                it = spain_Badajoz_Dir.entrySet().iterator();
                                break;

                            // CASTILLA LA MANCHA
                            case "Guadalajara":
                                it = spain_Guadalajara_Dir.entrySet().iterator();
                                break;
                            case "Cuenca":
                                it = spain_Cuenca_Dir.entrySet().iterator();
                                break;
                            case "Albacete":
                                it = spain_Albacete_Dir.entrySet().iterator();
                                break;
                            case "Toledo":
                                it = spain_Toledo_Dir.entrySet().iterator();
                                break;
                            case "CiudadReal":
                                it = spain_CiudadReal_Dir.entrySet().iterator();
                                break;

                            // CANARIAS
                            case "Tenerife":
                                it = spain_Tenerife_Dir.entrySet().iterator();
                                break;
                            case "GranCanaria":
                                it = spain_GranCanarias_Dir.entrySet().iterator();
                                break;
                            case "LaGomera":
                                it = spain_LaGomera_Dir.entrySet().iterator();
                                break;
                            case "LaPalma":
                                it = spain_LaPalma_Dir.entrySet().iterator();
                                break;
                            case "ElHierro":
                                it = spain_ElHierro_Dir.entrySet().iterator();
                                break;
                            case "Fuerteventura":
                                it = spain_Fuerteventura_Dir.entrySet().iterator();
                                break;
                            case "Lanzarote":
                                it = spain_Lanzarote_Dir.entrySet().iterator();
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
