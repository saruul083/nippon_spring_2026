package nippon.week12_day05_backend;

import java.util.ArrayList;
import java.util.HashMap;

class Book {
	String title, author, genre;
	int year;
	boolean available;
	
	Book (String title, String author, String genre, int year, boolean available){
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.year = year;
		this.available = available;
	}
	
	public String toString() {
		String status = available ? "yes" : "no";
		return String.format("[%s] \"%s \"by %s (%d) - %s",status, title, author, year, genre);
	}
}

class Library {
	ArrayList<Book> books = new ArrayList<>();
	HashMap<String, ArrayList<Book>> byGenre = new HashMap<>();
	
	void addBook(Book book) {
		books.add(book);
		byGenre.computeIfAbsent(book.genre, k -> new ArrayList<>()).add(book);
	}
	
	void removeBook(String title) {
		Book b = findByTitle(title);
		if (b != null) {
			 books.remove(b);
			 ArrayList<Book> genreList = byGenre.get(b.genre);
			 if (genreList != null) genreList.remove(b);
		}
	}
	
	Book findByTitle(String title) {
		for (Book b : books) {
			if(b.title.equalsIgnoreCase(title)) return b;
		}
		return null;
	}
}
