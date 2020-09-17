package fr.htc.library.dao;

import java.util.List;

import fr.htc.library.data.Book;
import fr.htc.library.utils.exceptions.CoteMandatoryException;

public interface BookDao {

	void save(Book book);

	/**
	 * Returns the value to which the specified cote is mapped, or null if this map contains no mapping for the cote. 
	 * @param cote
	 * @return
	 * @throws CoteMandatoryException
	 */
	Book findBookByCote(String cote) throws CoteMandatoryException;

	List<Book> findAvailableBooks();

	List<Book> findUnvailableBooks();
	

}
