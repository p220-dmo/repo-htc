package fr.htc.library.main;

import org.apache.log4j.Logger;

import fr.htc.library.dao.Storage;
import fr.htc.library.matricule.exception.MatriculeMandatoryException;
import fr.htc.library.services.BookService;
import fr.htc.library.services.CheckoutService;
import fr.htc.library.services.MemberService;
import fr.htc.library.services.impl.BookServiceImpl;
import fr.htc.library.services.impl.CheckoutServiceImpl;
import fr.htc.library.services.impl.MemberServiceImpl;

public class MyLibraryLuncher {
	private static Logger logger = Logger.getLogger(MyLibraryLuncher.class);
	private static MemberService memberService = new MemberServiceImpl();
	private static BookService bookService = new BookServiceImpl();
	private static CheckoutService checkoutService = new CheckoutServiceImpl();

	public static void main(String[] args) throws MatriculeMandatoryException  {

		memberService.addMember("Djamel", "MOUCHENE", 37);
		memberService.addMember("Liza", "SEGOUANE", 28);
		memberService.addMember("Raouf", "RETIMA", 39);
		logger.info(Storage.getMemberDB().keySet());



		bookService.addBook("Nedjma", "Kateb Yacine", 1985);
		bookService.addBook("L'Alchimiste", "Paolo Cohlo", 1994);
		bookService.addBook("Le fils du pauvre", "Mouloud FERAOUNE", 1985);
		bookService.addBook("Leon l'africain", "Amine Maalouf", 1985);

		logger.info(Storage.getBookDB().keySet());
		checkoutService.checkout("", "MO85-12");
		checkoutService.checkout("DM100", "MO85-12");
		checkoutService.checkout("DM100", "PA94-11");
		checkoutService.checkout("DM100", "AM85-13");

	}
}
