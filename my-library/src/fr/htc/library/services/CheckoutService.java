package fr.htc.library.services;

import java.util.List;

import fr.htc.library.data.Book;

public interface CheckoutService {
	
	public boolean checkout(String matricule, String cote);
	
	public List<Book> getAvailableBooks();

	public boolean checkIn(String matricule, String cote);
	
}
