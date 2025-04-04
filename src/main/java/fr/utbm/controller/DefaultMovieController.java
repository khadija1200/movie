package fr.utbm.controller;

import java.util.Scanner;

import fr.utbm.entity.Movie;


public class DefaultMovieController {
    
    public Movie RegisterMovieFromConsolInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel est le titre du film ?");
        String title = sc.nextLine();

        System.out.println("Combien d'exemplaires ?");
        int copies = sc.nextInt();

        return new Movie(title, copies);
    }
}


