package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void shouldReturnWelcomeMessage() {

        BibliotecaService bibliotecaService = new BibliotecaService();
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore", bibliotecaService.welcome());
    }

}
