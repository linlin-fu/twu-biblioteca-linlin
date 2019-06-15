package com.twu.biblioteca;


import org.junit.Test;
import sun.util.resources.LocaleData;

import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void shouldReturnWelcomeMessage() {

        BibliotecaService bibliotecaService = new BibliotecaService();
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore", bibliotecaService.welcome());
    }

    @Test
    public void shouldShowAllBooks() {
        BookService bookService = new BookService();
        bookService.addBook("Life", "",null);
        bookService.addBook("Thought", "", null);
        List<String> expectAllBooks = Arrays.asList("Life", "Thought");
        assertEquals(expectAllBooks, bookService.showAllBooks());
    }

    @Test
    public void shouldShowAllBooksInfo() {
        BookService bookService = new BookService();
        bookService.addBook("Life", "May", LocalDate.now());
        bookService.addBook("Thought", "Bob", LocalDate.of(1994,4,23));
        List<String> expectAllBooks = Arrays.asList("Life  May  2019-06-15", "Thought  Bob  1994-04-23");
        assertEquals(expectAllBooks, bookService.showAllBooksInfo());
    }

}
