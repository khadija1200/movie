package fr.utbm.repository;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMovieDao {
     public void save(String title, int copies) {
        
        try (FileWriter fileWriter = new FileWriter("C:\\temp\\films.txt", true);

            PrintWriter printWriter = new PrintWriter(fileWriter)) {

            printWriter.println("Titre: " + title + ", Copies: " + copies);
            System.out.println("Film enregistré avec succès !");
            
        } catch (IOException e) {
            System.err.println("Erreur lors de l'enregistrement du film : " + e.getMessage());
        }
    }

    public void saveMovie(String title, int copies, String MovieType, int mainActorId) {
        
        try (FileWriter fileWriter = new FileWriter("C:\\temp\\films.txt", true);

            PrintWriter printWriter = new PrintWriter(fileWriter)) {

            printWriter.println("Titre: " + title + ", Copies: " + copies +", Type de film:" + MovieType + ",Acteur principal:" + mainActorId);
            System.out.println("Film enregistré avec succès !");
            
        } catch (IOException e) {
            System.err.println("Erreur lors de l'enregistrement du film : " + e.getMessage());
        }
    }
}
