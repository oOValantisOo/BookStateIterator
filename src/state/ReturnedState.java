package state;

import model.Book;

public class ReturnedState extends State{

	public ReturnedState(Book book) {
		super(book);
		// TODO Auto-generated constructor stub
		book.setCurrentPhase("This book is returned");
	}

	@Override
	public void changeState() {
		// TODO Auto-generated method stub
		book.setState(null);
	}

}
