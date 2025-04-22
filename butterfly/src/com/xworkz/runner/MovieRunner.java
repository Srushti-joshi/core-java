package com.xworkz.runner;


import com.xworkz.external.ActionMovie;
import com.xworkz.internal.Movie;

public class MovieRunner {
        public static void main(String[] args) {
            System.out.println("=== Using Interface Reference ===");
            Movie movie = new ActionMovie();
            movie.play();
            movie.pause();
            movie.stop();

            System.out.println("\n=== Using Class Reference ===");
            ActionMovie actionMovie = new ActionMovie();
            actionMovie.play();
            actionMovie.pause();
            actionMovie.stop();
        }
    }
