package com.twu.biblioteca;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Book {

    private Integer id;
    private String name;
    private String author;
    private LocalDate publicationYear;
    private Boolean isCheckout = false;

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getId () {
        return this.id;
    }

    public String getName () {
        return name;
    }

    public String getInfo() {
        return this.id + "  " + this.name +  "  "  + this.author + "  " + this.publicationYear;
    }

    public void setIsCheckout(Boolean isCheckout) {
        this.isCheckout = isCheckout;
    }

    public boolean getIsCheckOut() {
        return this.isCheckout;
    }


}
