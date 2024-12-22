package main;

import java.util.ArrayList;
import java.util.Scanner;

import iterator.BookIterator;
import model.Book;

public class Main {
	
	public boolean checkName(String name){
		StringBuilder Mr = new StringBuilder();
		StringBuilder Mrs = new StringBuilder();
		
		if(name.length() < 4) {
			return false;
		}
		
		for(int i = 0; i < 3; i++) {
			Mr.append(name.charAt(i));
		}
		
		if(Mr.toString().equals("Mr.")) {
			return true;
		}
		
		for(int i = 0; i < 4; i++) {
			Mrs.append(name.charAt(i));
		}
		
		if(Mrs.toString().equals("Mrs.")) {
			return true;
		}
		
		return false;
		
	}
	public Main() {
		// TODO Auto-generated constructor stub
		Integer choice = -1;
		String bookName = "";
		String bookAuthor = "";
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<>();
		do {
			System.out.println("1. Add new book");
			System.out.println("2. View all books");
			System.out.println("3. Change book state");
			System.out.println("4. Exit");
			System.out.print("Enter: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				do {
					System.out.print("Enter book name [5 - 15 character]: ");
					bookName = sc.nextLine();
				}while(bookName.length() < 5 || bookName.length() > 15);
				
				do {
					System.out.print("Enter author name: ");
					bookAuthor = sc.nextLine();
				}while(!checkName(bookAuthor));
				
				Book book = new Book(bookName, bookAuthor);
				
				books.add(book);
			} else if(choice == 2) {
				if(books.isEmpty()) {
					System.out.println("Kosong");
				} else {
					BookIterator iterator = new BookIterator(books);
					
					while(iterator.hasNext()) {
						Book book = iterator.getNext();
						book.displayInformation();
				}
			} 
			} else if(choice == 3) {
				if(books.isEmpty()) {
					System.out.println("Kosong");
				} else {
					BookIterator iterator = new BookIterator(books);
					
					while(iterator.hasNext()) {
						Book book = iterator.getNext();
						book.displayInformation();
				}
					
					Integer index = -1;
					System.out.print("Enter book index you would like to change state: ");
					index = sc.nextInt();
					Book book = books.get(index);
					book.getState().changeState();
					
			}
		} else if(choice == 4) {
			System.out.println("Thank you");
		}
		}while(choice!=4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
