package ejercicio6test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter y el prisionero de Azkaban", 1, "J.K Rowling");
        Book book2 = new Book("Harry Potter y la piedra filosofal", 2, "J.K Rowling");
        Book book3 = new Book("Harry Potter y las reliquias de la muerte", 3, "J.K Rowling");
        Book book4 = new Book("Harry Potter y el principe mestizo", 4, "J.K Rowling");
        Book book5 = new Book("La ciudad y los perros", 5 , "Mario Vargas Llosa");

        DVD dvd1 = new DVD("Inception", 6, "Christopher Nola", 180);
        DVD dvd2 = new DVD("The Godfather", 7, "Francis Ford Coppola", 175);
        DVD dvd3 = new DVD("Interstellar", 8, "Christopher Nolan", 169);


        LibraryUser user1 = new LibraryUser("dfunn1k", 1);
        LibraryUser user2 = new LibraryUser("POHENIX", 2);

        Library library = new Library();
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);
        library.addItem(book4);
        library.addItem(book5);
        library.addItem(dvd1);
        library.addItem(dvd2);
        library.addItem(dvd3);
        library.addUser(user1);
        library.addUser(user2);

        library.showAllItems();
        library.loanItem(1, 1);
        library.showAllItems();

    }
}
