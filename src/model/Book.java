package model;

import state.AvailableState;
import state.State;

public class Book {
	private String BookName;
	private String BookAuthor;
	private State State;
	private String CurrentPhase;
	
	public Book(String bookName, String bookAuthor) {
		super();
		BookName = bookName;
		BookAuthor = bookAuthor;
		this.State = new AvailableState(this);
	}
	
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public State getState() {
		return State;
	}
	public void setState(State state) {
		State = state;
	}
	public String getCurrentPhase() {
		return CurrentPhase;
	}
	public void setCurrentPhase(String currentPhase) {
		CurrentPhase = currentPhase;
	}
	
	public void displayInformation() {
		System.out.println("Book name: " + this.BookName);
		System.out.println("Book author: " + this.BookAuthor);
		System.out.println(this.CurrentPhase);
	}
	
	
}
