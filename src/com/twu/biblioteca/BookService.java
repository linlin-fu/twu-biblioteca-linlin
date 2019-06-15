package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    private List<Book> allBooks = new ArrayList<Book>();



    public void addBook(String name) {
        Book book = new Book();
        book.setName(name);
        this.allBooks.add(book);
    }

    public List<String> showAllBooks() {
        List<Book> bookList = this.allBooks;
        List<String> books = bookList.stream().map(Book::getName).collect(Collectors.toList());
        return books;
    }

}
