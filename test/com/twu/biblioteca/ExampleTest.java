package com.twu.biblioteca;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import java.time.LocalDate;

import java.util.Arrays;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class ExampleTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

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

    @Test
    public void shouldShowMenuList() {
        Menu menu = new Menu();
        menu.addMenuList("lists of book, press 1");
        List<String> expectMenuList = Arrays.asList("lists of book, press 1");
        assertEquals(expectMenuList, menu.showMenu());
    }

    @Test
    public void shouldPrintInvalidMessage() {
        BibliotecaService bibliotecaService = new BibliotecaService();
        String message = bibliotecaService.showNoitified();
        assertEquals("Please select a valid Option!", message);
    }

    @Test
    public void shouldQuit() {
        BibliotecaService bibliotecaService = new BibliotecaService();
        bibliotecaService.handleMenuSelection(2);
        assertEquals("", outContent.toString());
    }

}
