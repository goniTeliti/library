package it.book;

public class Book {

	private String title;
	private String author;
	private String gender;
	
	
	
	
	
	
	
	public Book(String title, String author, String gender) {
		this.title = title;
		this.author = author;
		this.gender = gender;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book() {
		super();
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
