package fr.htc.library.dao;

import fr.htc.library.data.Book;

public interface BookDao {

	void save(Book book);

	Book findBookByCote(String cote);

}
