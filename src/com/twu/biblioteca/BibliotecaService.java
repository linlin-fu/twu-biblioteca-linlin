package com.twu.biblioteca;

import java.time.LocalDate;
import java.util.List;

public class BibliotecaService {

    public String  welcome() {
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore";
        return welcomeMessage;
    }

    public List<String > showMenuList() {
        Menu menu = new Menu();
        System.out.println("Please select");
        menu.addMenuList("lists of book, press 1");
        return menu.showMenu();
    }

    public void handleMenuSelection(Integer select) {
        switch (select) {
            case 1:
                showBookList();
            default:
                showNoitified();

        }
    }

    public void showBookList() {
        BookService bookService = new BookService();
        bookService.addBook("Life", "May", LocalDate.now());
        bookService.addBook("Thought", "Bob", LocalDate.of(1994,4,23));
//        bookService.showAllBooks().forEach(System.out::println);
        bookService.showAllBooksInfo().forEach(System.out::println);
    }

    public void showNoitified() {
        System.out.print("Please select a valid Option!");
    }
}
