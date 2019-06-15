package com.twu.biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        showWeclome();

        showMenuList();

        Integer select = getSelection();

        handleMenuSelection(select);


    }

    private static Integer getSelection() {
        Integer select = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            select = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input error");
        }
        return select;
    }

    private static void handleMenuSelection(Integer select) {
        switch (select) {
            case 1:
                showBookList();
                break;
            case 2:
                break;
            default:
                System.out.println("invalid selection");

        }
    }

    private static void showBookList() {
        BookService bookService = new BookService();
        bookService.addBook("Life", "May", LocalDate.now());
        bookService.addBook("Thought", "Bob", LocalDate.of(1994,4,23));
//        bookService.showAllBooks().forEach(System.out::println);
        bookService.showAllBooksInfo().forEach(System.out::println);
    }

    private static void showMenuList() {
        Menu menu = new Menu();
        System.out.println("Please select");
        menu.addMenuList("lists of book, press 1");
        menu.showMenu().forEach(System.out::println);
    }

    private static void showWeclome() {
        BibliotecaService bibliotecaService = new BibliotecaService();
        System.out.println(bibliotecaService.welcome());
    }

}
