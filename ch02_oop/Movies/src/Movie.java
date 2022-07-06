public class Movie {
    Integer rank;
    String title;
    String director;
    Integer score;

    
    public Movie(Integer rank, String title, String director, Integer score) {
        this.rank = rank;
        this.title = title;
        this.director = director;
        this.score = score;
    }


    public Integer getRank() {
        return rank;
    }


    public void setRank(Integer rank) {
        this.rank = rank;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getDirector() {
        return director;
    }


    public void setDirector(String director) {
        this.director = director;
    }


    public Integer getScore() {
        return score;
    }


    public void setScore(Integer score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return "Movie [director=" + director + ", rank=" + rank + ", score=" + score + ", title=" + title + "]";
    }

    

}
