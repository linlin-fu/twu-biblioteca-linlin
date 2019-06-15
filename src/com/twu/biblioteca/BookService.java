package com.twu.biblioteca;

import sun.util.resources.LocaleData;

import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    private List<Book> allBooks = new ArrayList<Book>();
    Integer idNumber = 0;
    static String succeed = "Thank you! Enjoy the book";
    static String failed = "Sorry, that book is not available";


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

    public String checkOutBook(Integer id) {

        List<Book> findBook =  getBookById(this.allBooks, id);
        if (findBook.size() >= 1) {
            Book book = allBooks.get(0);
            book.setIsCheckout(true);
            return succeed;
        } else {
            return failed;
        }

    }

    private List<Book> getBookById(List<Book> allBooks, Integer id) {
        List<Book> findBook = allBooks.stream().filter(item -> item.getId().equals(id)).collect(Collectors.toList());
        return findBook;
    }
}

