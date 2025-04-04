package fr.utbm.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.utbm.entity.Movie;

import java.sql.SQLException;
public class JdbcFilmDao {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";


    public void saveStatement(String title, int copies, String movieType, String mainActor) {
        String sql = "INSERT INTO movie(title, copies, movie_type, main_actor_id) VALUES ('" 
                     + title + "', " + copies + ", '" + movieType + "', '" + mainActor + "')";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {

            int rowsInserted = stmt.executeUpdate(sql);
            if (rowsInserted > 0) {
                System.out.println("Film ajouté avec succès !");
            }

        } catch (SQLException e) {
            System.err.println("Erreur lors de l'insertion du film : " + e.getMessage());
        }
    }



    public void savePreparedStatement(String title, int copies, String movieType, String mainActor) {
        String sql = "INSERT INTO movie(title, copies, movie_type, main_actor_id) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, title);
            pstmt.setInt(2, copies);
            pstmt.setString(3, movieType);
            pstmt.setString(4, mainActor);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Film ajouté avec succès !");
            }

        } catch (SQLException e) {
            System.err.println("Erreur lors de l'insertion du film : " + e.getMessage());
        }
    }


    public ArrayList<Movie> listFilm() {
        ArrayList<Movie> movies = new ArrayList<>();
    
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM movie")) {
    
                while (rs.next()) { 
                    movies.add(new Movie(
                        rs.getString("title"), 
                        rs.getInt("copies"), 
                        rs.getString("movie_type"), 
                        rs.getInt("main_actor_id") 
                    ));
                }
                
    
        } catch (SQLException e) {
            System.err.println("Erreur lors de la récupération des films : " + e.getMessage());
        }
    
        return movies;
    }
    
}
