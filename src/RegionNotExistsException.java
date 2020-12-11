public class RegionNotExistsException extends Exception {
    private String country;
    private String region;

    public RegionNotExistsException(String country, String region) {
        super("Region: " + region + " in country " + country + " not exists");
        this.country = country;
        this.region = region;
    }
}
