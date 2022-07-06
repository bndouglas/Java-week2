public class LargestVolume extends LargestBuilding{
    
    Integer year;
    Integer volume;

    
    public LargestVolume(Integer rank, String name, String country, String place, Integer year, Integer volume) {
        
        super(rank, name, country, place);
        this.year = year;
        this.volume = volume;
    }


    public Integer getYear() {
        return year;
    }


    public void setYear(Integer year) {
        this.year = year;
    }


    public Integer getVolume() {
        return volume;
    }


    public void setVolume(Integer volume) {
        this.volume = volume;
    }




    

}
