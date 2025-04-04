package fr.utbm;

import java.util.ArrayList;

import fr.utbm.entity.Movie;
import fr.utbm.repository.FileMovieDao;
import fr.utbm.repository.JdbcFilmDao;

public class AppEntity1 {

    

    public static void main(String[] args) {

        //DefaultMovieController controller = new DefaultMovieController();
        
        //FileMovieDao fileMovieDao = new FileMovieDao();

        FileMovieDao fileMovieDao2= new FileMovieDao();

        //Movie movie = controller.RegisterMovieFromConsolInput();

        //fileMovieDao.save(movie.getTitle(), movie.getCopies());


        JdbcFilmDao jdbcFilmDao = new JdbcFilmDao(); 
        ArrayList<Movie> films = jdbcFilmDao.listFilm(); 

        for (Movie movieReturn : films) {
            System.out.println("Titre: " + movieReturn.getTitle() + 
                            ", Copies: " + movieReturn.getCopies() + 
                            ", Genre: " + movieReturn.getMovieType() + 
                            ", Acteur principal ID: " + movieReturn.getMainActorId());

            fileMovieDao2.saveMovie(movieReturn.getTitle(), movieReturn.getCopies(),movieReturn.getMovieType(),movieReturn.getMainActorId());
        }    
        
       

        }


}
