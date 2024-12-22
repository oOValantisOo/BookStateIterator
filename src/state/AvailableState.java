package state;

import model.Book;

public class AvailableState extends State{

	public AvailableState(Book book) {
		super(book);
		book.setCurrentPhase("This book is available");
	}

	@Override
	public void changeState() {
		// TODO Auto-generated method stub
		book.setState(new BorrowedState(book));
	}

}
