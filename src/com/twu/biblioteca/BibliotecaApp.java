package com.twu.biblioteca;

import java.time.LocalDate;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaService bibliotecaService = new BibliotecaService();
        System.out.println(bibliotecaService.welcome());

        BookService bookService = new BookService();
        bookService.addBook("Life", "May", LocalDate.now());
        bookService.addBook("Thought", "Bob", LocalDate.of(1994,4,23));
//        bookService.showAllBooks().forEach(System.out::println);
        bookService.showAllBooksInfo().forEach(System.out::println);

    }

}
