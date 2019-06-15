package com.twu.biblioteca;

import java.time.LocalDate;

public class Book {

    private String name;
    private String author;
    private LocalDate publicationYear;
    private Boolean isCheckout = false;

    public void setName(String name) {
        this.name = name;
    }

    public void setBookInfo(String author, LocalDate publicationYear) {
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getName () {
        return name;
    }

    public String getInfo() {
        return this.name +  "  "  + this.author + "  " + this.publicationYear;
    }


}
