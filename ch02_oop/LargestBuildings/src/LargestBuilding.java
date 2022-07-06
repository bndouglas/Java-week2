public class LargestBuilding {
    Integer rank;
    String name;
    String country;
    String place;

    
    public LargestBuilding(Integer rank, String name, String country, String place) {
        this.rank = rank;
        this.name = name;
        this.country = country;
        this.place = place;
    }

    public Integer getRank() {
        return rank;
    }


    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }


    public String getPlace() {
        return place;
    }


    public void setPlace(String place) {
        this.place = place;
    }

    
}
