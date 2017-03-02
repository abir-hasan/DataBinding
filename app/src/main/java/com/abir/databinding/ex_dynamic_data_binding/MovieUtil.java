package com.abir.databinding.ex_dynamic_data_binding;

import java.util.ArrayList;

/**
 * Created by Abir Hasan on 02-Mar-17.
 */

public class MovieUtil {
    public static ArrayList<Movie> getMovieList() {

        ArrayList<Movie> movies = new ArrayList<>();
        Movie movie;

        movie = new Movie();
        movie.setName("The Terminal");
        movie.setDirector("Steven Spielberg");
        movie.setPosterUrl("https://images-na.ssl-images-amazon.com/images/M/MV5BMTM1MTIwNTMxOF5BMl5BanBnXkFtZTcwNjIxMjQyMw@@._V1_UY268_CR8,0,182,268_AL_.jpg");
        movie.setReleaseYear(2004);
        movies.add(movie);

        movie = new Movie();
        movie.setName("Catch Me If You Can");
        movie.setDirector("Steven Spielberg");
        movie.setPosterUrl("https://images-na.ssl-images-amazon.com/images/M/MV5BMTY5MzYzNjc5NV5BMl5BanBnXkFtZTYwNTUyNTc2._V1_UX182_CR0,0,182,268_AL_.jpg");
        movie.setReleaseYear(2002);
        movies.add(movie);

        movie = new Movie();
        movie.setName("Inception");
        movie.setDirector("Christopher Nolan");
        movie.setPosterUrl("https://images-na.ssl-images-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_UX182_CR0,0,182,268_AL_.jpg");
        movie.setReleaseYear(2010);
        movies.add(movie);

        movie = new Movie();
        movie.setName("The Dark Knight");
        movie.setDirector("Christopher Nolan");
        movie.setPosterUrl("https://images-na.ssl-images-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_UX182_CR0,0,182,268_AL_.jpg");
        movie.setReleaseYear(2008);
        movies.add(movie);

        movie = new Movie();
        movie.setName("Her");
        movie.setDirector("Spike Jonze");
        movie.setPosterUrl("https://images-na.ssl-images-amazon.com/images/M/MV5BMjA1Nzk0OTM2OF5BMl5BanBnXkFtZTgwNjU2NjEwMDE@._V1_UX182_CR0,0,182,268_AL_.jpg");
        movie.setReleaseYear(2013);
        movies.add(movie);

        movie = new Movie();
        movie.setName("Silver Linings Playbook");
        movie.setDirector("David O. Russell");
        movie.setPosterUrl("https://images-na.ssl-images-amazon.com/images/M/MV5BMTM2MTI5NzA3MF5BMl5BanBnXkFtZTcwODExNTc0OA@@._V1_UX182_CR0,0,182,268_AL_.jpg");
        movie.setReleaseYear(2012);
        movies.add(movie);

        movie = new Movie();
        movie.setName("The Social Network");
        movie.setDirector("David Fincher");
        movie.setPosterUrl("https://images-na.ssl-images-amazon.com/images/M/MV5BMTM2ODk0NDAwMF5BMl5BanBnXkFtZTcwNTM1MDc2Mw@@._V1_UX182_CR0,0,182,268_AL_.jpg");
        movie.setReleaseYear(2010);
        movies.add(movie);

        return movies;
    }
}
