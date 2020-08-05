package fr.htc.library.services;

import java.util.List;

import fr.htc.library.data.Book;

public interface BookService {

	public void addBook(String title, String author, int editionYear);

	public Book findBookByCote(String cote);

	public List<Book> getAllBooks();

	public Book deleteBook(String cote);
	
	public Book update(String title, String author, int editionYear);

}
