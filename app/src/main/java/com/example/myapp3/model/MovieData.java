package com.example.myapp3.model;

import java.util.ArrayList;

public class MovieData {
    public ArrayList<Movie> movies =new ArrayList<>();
    public MovieData(){

        movies.add(new Movie("The Shawshank Redemption","2012","Drama"));
        movies.add(new Movie("12 Angry Men","1957","Drama"));
        movies.add(new Movie("Incepetinon","2010","Action"));
        movies.add(new Movie("Goodfellas","1990","Drama"));
        movies.add(new Movie("The Matrix","1999","Action"));
        movies.add(new Movie("Interstellar","2014","Advaenture"));
        movies.add(new Movie("Memento","2000","Mystery"));
    }
}
