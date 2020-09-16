package fr.htc.library.services.impl;

import java.util.List;

import fr.htc.library.dao.BookDao;
import fr.htc.library.dao.impls.BookDaoMapImp;
import fr.htc.library.data.Book;
import fr.htc.library.services.BookService;

public class BookServiceImpl implements BookService {

	private BookDao bookDao = new BookDaoMapImp();

	public void addBook(String title, String author, int editionYear) {
		Book book = new Book(title, author, editionYear);
		bookDao.save(book);

	}

	public Book findBookByCote(String cote) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	public Book deleteBook(String cote) {
		// TODO Auto-generated method stub
		return null;
	}

	public Book update(String title, String author, int editionYear) {
		// TODO Auto-generated method stub
		return null;
	}

}
