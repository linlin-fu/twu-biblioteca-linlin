package com.twu.biblioteca;


import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
        bookService.addBook("Life");
        bookService.addBook("Thought");
        List<String> expectAllBooks = Arrays.asList("Life", "Thought");
        assertEquals(expectAllBooks, bookService.showAllBooks());
    }

}
