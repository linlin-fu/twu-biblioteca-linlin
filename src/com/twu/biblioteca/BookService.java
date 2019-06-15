package com.twu.biblioteca;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    private List<Book> allBooks = new ArrayList<Book>();



    public void addBook(String name, String author, LocalDate publicationYear) {
        Book book = new Book();
        book.setName(name);
        book.setBookInfo(author, publicationYear);
        this.allBooks.add(book);
    }

    public List<String> showAllBooks() {
        List<Book> bookList = this.allBooks;
        List<String> books = bookList.stream().map(Book::getName).collect(Collectors.toList());
        return books;
    }

    public List<String> showAllBooksInfo() {
        List<Book> bookList = this.allBooks;
        List<String> books = bookList.stream().map(Book::getInfo).collect(Collectors.toList());
        return books;
    }


}
