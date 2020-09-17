package fr.htc.library.services;

import java.util.List;

import fr.htc.library.data.Book;
import fr.htc.library.matricule.exception.MatriculeMandatoryException;

public interface CheckoutService {
	
	public boolean checkout(String matricule, String cote) throws MatriculeMandatoryException;
	
	public List<Book> getAvailableBooks();

	public boolean checkIn(String matricule, String cote) throws MatriculeMandatoryException;

	public List<Book> getUnvailableBooks();

	public List<String> getAvailableCotes();
	
}
