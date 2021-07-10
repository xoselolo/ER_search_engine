public class EscapeRoom {
    // Attributes
    private String place_id;
    private String name;
    private String direction; // vicinity
    private String website;
    private String international_phone_number; // o quizas el fromatted_phone_number
    private Float rating;
    private String business_status;
    private String schedule[];

    // Constructor
    public EscapeRoom(String place_id, String name, String direction, String website, String international_phone_number, Float rating, String business_status, String[] schedule) {
        this.place_id = place_id;
        this.name = name;
        this.direction = direction;
        this.website = website;
        this.international_phone_number = international_phone_number;
        this.rating = rating;
        this.business_status = business_status;
        this.schedule = schedule;
    }

    // Getters & Setters
    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getInternational_phone_number() {
        return international_phone_number;
    }

    public void setInternational_phone_number(String international_phone_number) {
        this.international_phone_number = international_phone_number;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getBusiness_status() {
        return business_status;
    }

    public void setBusiness_status(String business_status) {
        this.business_status = business_status;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[] schedule) {
        this.schedule = schedule;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.name + " (" + this.place_id + ")" + System.lineSeparator());
        if(this.direction != null){
            builder.append("    " + "Direction: " + this.direction + System.lineSeparator());
        }
        if(this.international_phone_number != null){
            builder.append("    " + "Phone: " + this.international_phone_number + System.lineSeparator());
        }
        if(this.website != null){
            builder.append("    " + "Website: " + this.website + System.lineSeparator());
        }
        if(this.rating != null){
            builder.append("    " + "Rating: " + this.rating + System.lineSeparator());
        }
        builder.append(System.lineSeparator());

        return builder.toString();
    }
}
