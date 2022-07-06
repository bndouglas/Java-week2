public class Song {
    Integer chartPosition;
    String title;
    String artist;
    String label;

    
    public Song(Integer chartPosition, String title, String artist, String label) {
        this.chartPosition = chartPosition;
        this.title = title;
        this.artist = artist;
        this.label = label;
    }


    public Integer getChartPosition() {
        return chartPosition;
    }


    public void setChartPosition(Integer chartPosition) {
        this.chartPosition = chartPosition;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getArtist() {
        return artist;
    }


    public void setArtist(String artist) {
        this.artist = artist;
    }


    public String getLabel() {
        return label;
    }


    public void setLabel(String label) {
        this.label = label;
    }


    @Override
    public String toString() {
        return "Song [artist=" + artist + ", chartPosition=" + chartPosition + ", label=" + label + ", title=" + title
                + "]";
    }




    
}
