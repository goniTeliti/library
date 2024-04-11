package it.test;

import java.util.Scanner;

import it.book.Book;
import it.libraryClass.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungi libro");
            System.out.println("2. Visualizza catalogo libri");
            System.out.println("3. Esci");
            System.out.println("4. Cerca Autore");
            System.out.print("Scelta: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consuma la nuova linea rimasta
            
            switch (choice) {
                case 1:
                    System.out.print("Titolo del libro: ");
                    String title = scanner.nextLine();
                    System.out.print("Autore del libro:");
                    String author = scanner.nextLine();
                    System.out.print("Genere del libro: ");
                    String genre = scanner.nextLine();
                    library.addBook(new Book(title, author, genre));
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Arrivederci!");
                    break;
                case 4:
                	library.searchAuthor();
                	break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }
        
        scanner.close();
    }
}
