package com.twu.biblioteca;


public class BibliotecaApp {

    public static void main(String[] args) {

        BibliotecaService bibliotecaService = new BibliotecaService();
        System.out.println(bibliotecaService.welcome());

        bibliotecaService.showMenuList().forEach(System.out::println);
        Integer select = bibliotecaService.getSelection();
        if (select != null) {
        bibliotecaService.handleMenuSelection(select);
        }

    }


}
