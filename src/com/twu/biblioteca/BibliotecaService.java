package com.twu.biblioteca;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class BibliotecaService {

    BookService bookService = new BookService();

    public String  welcome() {
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore";
        return welcomeMessage;
    }

    public List<String > showMenuList() {
        Menu menu = new Menu();
        System.out.println("Please select");
        menu.addMenuList("lists of book, press 1");
        menu.addMenuList("quit, press 2");
        menu.addMenuList("check out book, press 3");
        menu.addMenuList("Return book, press 4");
        return menu.showMenu();
    }

    public void handleMenuSelection(Integer select) {
        switch (select) {
            case 1:
                showBookList();
                getSelection();
            case 2:
                break;
            case 3:
                System.out.println(checkoutBook());
                getSelection();
            case 4:
                System.out.println(returnBook());
            default:
                System.out.println(showNoitified());
                getSelection();

        }
    }

    private String checkoutBook() {

        showBookList();
        Integer id = getSelection();
        String response = bookService.checkOutBook(id);
        return response;
    }

    private String returnBook() {
        Integer id = getSelection();
        String response = bookService.checkOutBook(id);
        return response;
    }

    public void showBookList() {
        bookService.addBook("Life", "May", LocalDate.now());
        bookService.addBook("Thought", "Bob", LocalDate.of(1994,4,23));
//        bookService.showAllBooks().forEach(System.out::println);
        bookService.showAllBooksInfo().forEach(System.out::println);
    }

    public String showNoitified() {
        return "Please select a valid Option!";
    }

    public Integer getSelection() {
        while (true) {
            Integer select = 0;
            try {
                Scanner scanner = new Scanner(System.in);
                select = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Input error");
            }
            return select;
        }
    }

}
