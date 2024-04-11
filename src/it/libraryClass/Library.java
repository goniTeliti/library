package it.libraryClass;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import it.book.Book;

public class Library {
Scanner sc=new Scanner(System.in);
	
	List<Book>books;
	
	public Library() {
		books=new ArrayList<>();
	}
	
	public void addBook(Book book) {
		
		books.add(book);
		System.out.println("Libro salvato con successo");
	}
	public void displayBooks() {
		if(books.isEmpty()) {
			System.out.println("Nessun libro disponibile");
		}
		else {
			System.out.println("Catalogo dei libri");
			for(Book b:books) {
                System.out.println("Titolo: " + b.getTitle() + "\n, Autore: " + b.getAuthor() + "\n, Genere: " + b.getGender());
			}
		}
			
		}
	public void searchAuthor() {
		for(Book b:books) {
			System.out.println("Inserisci il nome del autore che vuoi cercare ");

		String s=sc.nextLine();
		if(s.equals(b.getAuthor())) {
			System.out.println("L autore : "+b.getAuthor()+" Ce!");
			displayBooks();
		}
		else {
			System.out.println("L autore : "+s+" Non  Ce!");
		}
		}
	}
}
