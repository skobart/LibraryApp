package pl.javastart.library.app;

import pl.javastart.library.model.Book;

/**
 * Created by Bartłomiej Skorowski on 03.01.2020.
 */
public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.5";

        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010,
                296, "Greg", "9788373271890");
        Book book2 = new Book("Java. Efektywne programowanie", "Joshua Bloch", 2009,
                352, "Helion", "985656115458f48");
        Book book3 = new Book("Coś tam", "Ktoś Tam", 1958,
                159, "Niewiadomo");


//        book1.checked = LocalDate.now();

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}
