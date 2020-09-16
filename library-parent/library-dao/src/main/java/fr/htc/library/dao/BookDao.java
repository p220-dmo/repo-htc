package fr.htc.library.dao;

import java.util.List;

import fr.htc.library.data.Book;

public interface BookDao {

	void save(Book book);

	Book findBookByCote(String cote);

	List<Book> findAvailableBooks();

	List<Book> findUnvailableBooks();
	

}
