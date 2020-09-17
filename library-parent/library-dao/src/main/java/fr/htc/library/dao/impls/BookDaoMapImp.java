package fr.htc.library.dao.impls;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import fr.htc.library.dao.BookDao;
import fr.htc.library.dao.Storage;
import fr.htc.library.data.Book;
import fr.htc.library.utils.exceptions.CoteMandatoryException;

public class BookDaoMapImp implements BookDao {

	public void save(Book book) {
		Storage.getBookDB().put(book.getCote(), book);
	}

	/**
	 * Returns the value to which the specified cote is mapped, or null if this map contains no mapping for the cote. 
	 * @param cote
	 * @return
	 * @throws CoteMandatoryException
	 */
	public Book findBookByCote(String cote) throws CoteMandatoryException {
		StringUtils.substring(cote, 1, 5);
		if(StringUtils.isBlank(cote)){
			throw new CoteMandatoryException("Null is not a valid cote");
		}
		return Storage.getBookDB().get(cote);
		
	}

	public List<Book> findAvailableBooks() {
		List<Book> availableBooks = new ArrayList<Book>();

		for (Book book : Storage.getBookDB().values()) {
			if (book.isAvailable() == true) {
				availableBooks.add(book);
			}
		}

		return availableBooks;
	}
	
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
