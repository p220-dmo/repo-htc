package fr.htc.library.dao.impls;

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

}
