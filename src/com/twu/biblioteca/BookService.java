package com.twu.biblioteca;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    private List<Book> allBooks = new ArrayList<Book>();
    Integer idNumber = 0;


    public void addBook(String name, String author, LocalDate publicationYear) {
        Book book = new Book();
        this.idNumber++;
        book.setId(idNumber);
        book.setName(name);
        book.setBookInfo(author, publicationYear);
        this.allBooks.add(book);
    }

    public List<String> showAllBooks() {
        List<Book> bookList = this.allBooks;
        List<String> books = bookList.stream().filter(book -> !book.getIsCheckOut()).map(Book::getName).collect(Collectors.toList());
        return books;
    }

    public List<String> showAllBooksInfo() {
        List<Book> bookList = this.allBooks;
        List<String> books = bookList.stream().filter(book -> !book.getIsCheckOut()).map(Book::getInfo).collect(Collectors.toList());
        return books;
    }

    public void checkOutBook(Integer id) {
        Book book = getBookById(this.allBooks, id);
        book.setIsCheckout(true);
    }

    private Book getBookById(List<Book> allBooks, Integer id) {
        Book book = new Book();
        allBooks.stream().filter(item -> item.getId().equals(id)).collect(Collectors.toList());
        if (allBooks.size() == 1) {
            book = allBooks.get(0);
        }
        return book;
    }
}

