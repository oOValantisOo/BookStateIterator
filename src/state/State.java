package state;

import model.Book;

public abstract class State {
	protected Book book;
	
	public State(Book book) {
		super();
		this.book = book;
	}
	
	public abstract void changeState();
}
