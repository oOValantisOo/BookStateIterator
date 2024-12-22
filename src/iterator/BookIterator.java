package iterator;

import java.util.ArrayList;

import model.Book;

public class BookIterator implements Iterator<Book> {
	private ArrayList<Book> books;
	private Integer index;
	
	public BookIterator(ArrayList<Book> books) {
		super();
		this.books = books;
		index = 0;
	}
	
	@Override
	public Book getNext() {
		// TODO Auto-generated method stub
		if(hasNext()) {
			return books.get(index++);
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index < books.size();
	}

}
