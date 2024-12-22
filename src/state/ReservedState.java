package state;

import model.Book;

public class ReservedState extends State{

	public ReservedState(Book book) {
		super(book);
		// TODO Auto-generated constructor stub
		book.setCurrentPhase("This book is reserved");
	}

	@Override
	public void changeState() {
		// TODO Auto-generated method stub
		book.setState(new ReturnedState(book));
	}

}
