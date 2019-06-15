package com.twu.biblioteca;

import sun.util.resources.LocaleData;

public class Book {

    private String name;
    private String author;
    private LocaleData publicationYear;
    private Boolean isCheckout = false;

    public void setName(String name) {
        this.name = name;
    }

    public void setBookInfo(String author, LocaleData publicationYear) {
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getName () {
        return name;
    }


}
