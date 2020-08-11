package fr.htc.library.dao.impls;

import java.util.ArrayList;
import java.util.List;

import fr.htc.library.dao.BookDao;
import fr.htc.library.dao.Storage;
import fr.htc.library.data.Book;

public class BookDaoMapImp implements BookDao {

	@Override
	public void save(Book book) {
		Storage.getBookDB().put(book.getCote(), book);
	}

	@Override
	public Book findBookByCote(String cote) {
		return Storage.getBookDB().get(cote);
	}

	@Override
	public List<Book> findAvailableBooks() {
		List<Book> availableBooks = new ArrayList<Book>();

		for (Book book : Storage.getBookDB().values()) {
			if (book.isAvailable() == true) {
				availableBooks.add(book);
			}
		}

		return availableBooks;
	}
	
	@Override
	public List<Book> findUnvailableBooks() {
		List<Book> unavailableBooks = new ArrayList<Book>();
		
		for (Book book : Storage.getBookDB().values()) {
			if (book.isAvailable() == false) {
				unavailableBooks.add(book);
			}
		}
		
		return unavailableBooks;
	}

}
