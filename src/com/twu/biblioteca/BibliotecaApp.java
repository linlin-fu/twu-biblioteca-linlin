package com.twu.biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        BibliotecaService bibliotecaService = new BibliotecaService();
        System.out.println(bibliotecaService.welcome());

        bibliotecaService.showMenuList().forEach(System.out::println);

        Integer select = getSelection();

        bibliotecaService.handleMenuSelection(select);

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
}
