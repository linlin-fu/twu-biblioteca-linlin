package com.twu.biblioteca;

import sun.util.resources.LocaleData;

public class Book {

    private String author;
    private LocaleData publicationYear;
    private Boolean isCheckout = false;

    public void setBookInfo(String author, LocaleData publicationYear) {
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

}
