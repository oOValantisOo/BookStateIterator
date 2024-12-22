package state;

import model.Book;

public class BorrowedState extends State{

	public BorrowedState(Book book) {
		super(book);
		// TODO Auto-generated constructor stub
		book.setCurrentPhase("This book is borrowed");
	}

	@Override
	public void changeState() {
		// TODO Auto-generated method stub
		book.setState(new ReservedState(book));
	}

}
