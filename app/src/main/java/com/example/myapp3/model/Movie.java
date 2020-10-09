package com.example.myapp3.model;

public class Movie {
    private String Name;
    private String Year;
    private String genre;

    public Movie(String name, String year, String genre) {
        Name = name;
        Year = year;
        this.genre = genre;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return this.Name+" "+this.Year+"  "+this.genre;
    }
}

