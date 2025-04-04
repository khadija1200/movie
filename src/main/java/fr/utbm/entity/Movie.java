package fr.utbm.entity;

public class Movie  implements java.io.Serializable {

     private Integer id;
     private String title;
     private int copies;
     private String movieType;
     private Actor mainActor;
     private Integer mainActorId;

    public Movie() {
    }

    public Movie(Integer id, String title, int copies, String movieType) {
        this.id = id;
        this.title = title;
        this.copies = copies;
        this.movieType = movieType;
    }

    public Movie( String title, int copies) {
        this.title = title;
        this.copies = copies;
    }

    public Movie( String title, int copies, String movieType, Integer mainActorId) {
       this.title = title;
       this.copies = copies;
       this.movieType = movieType;
       this.mainActorId = mainActorId;
    }
    public Movie(Integer id, String title, int copies, String movieType, Actor mainActor) {
        this.id = id;
        this.title = title;
        this.copies = copies;
        this.movieType = movieType;
        this.mainActor = mainActor;
     }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public int getCopies() {
        return this.copies;
    }
    
    public void setCopies(int copies) {
        this.copies = copies;
    }
    public String getMovieType() {
        return this.movieType;
    }

    public Integer getMainActorId() {
        return this.mainActorId;
    }
    
    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }
    public Actor getMainActor() {
        return this.mainActor;
    }
    
    public void setMainActor(Actor mainActor) {
        this.mainActor = mainActor;
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", title=" + title + ", copies=" + copies + ", movieType=" + movieType + ", mainActor=" + mainActor + '}';
    }
}


