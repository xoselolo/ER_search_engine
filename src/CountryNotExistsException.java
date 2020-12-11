public class CountryNotExistsException extends Exception {
    private String country;

    public CountryNotExistsException(String country) {
        super("Country " + country + " not exists");
        this.country = country;
    }
}
