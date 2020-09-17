package fr.htc.library.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import fr.htc.library.dao.BookDao;
import fr.htc.library.dao.MemberDao;
import fr.htc.library.dao.impls.BookDaoMapImp;
import fr.htc.library.dao.impls.MemberDaoMapImp;
import fr.htc.library.data.Book;
import fr.htc.library.data.Member;
import fr.htc.library.matricule.exception.MatriculeMandatoryException;
import fr.htc.library.services.CheckoutService;
import fr.htc.library.utils.exceptions.CoteMandatoryException;

public class CheckoutServiceImpl implements CheckoutService {
	private static Logger logger = Logger.getLogger(CheckoutServiceImpl.class);

	private MemberDao memberDao = new MemberDaoMapImp();
	private BookDao bookDao = new BookDaoMapImp();

	public boolean checkout(String matricule, String cote) throws MatriculeMandatoryException {
		try {
			Book book = bookDao.findBookByCote(cote);
			if (book == null) {
				logger.info("No mapping book with the cote : " + cote);
				return false;
			}

			Member member = memberDao.findMemberByMatricule(matricule);
			if (member == null) {
				logger.info("No mapping member with the matricule : " + matricule);
				return false;
			}

			if (book.isAvailable() & member.canCheckout()) {
				book.setBorrower(member);
				member.getBorrowedBooks().add(book);
				System.out.println("Succees");
				return true;
			}

		} catch (MatriculeMandatoryException mme) {
			logger.info("No member found with matricule : |" + matricule + "|" , mme);
		} catch (CoteMandatoryException cme) {
			logger.info("No Book found with cote : " + cote , cme);
		}
		return false;
	}

	public List<Book> getAvailableBooks() {
		return bookDao.findAvailableBooks();
	}

	public List<Book> getUnvailableBooks() {
		return bookDao.findUnvailableBooks();
	}

	public boolean checkIn(String matricule, String cote) throws MatriculeMandatoryException {
		Member member = memberDao.findMemberByMatricule(matricule);
		if (member == null) {
			logger.info("No mapping member with the matricule : " + matricule);
			return false;
		}
		Book book = null;

		try {
			book = bookDao.findBookByCote(cote);
		} catch (CoteMandatoryException e) {
			e.printStackTrace();
		}

		if (book.getBorrower().getMatricule() == member.getMatricule() && member.getBorrowedBooks().contains(book)) {
			book.setBorrower(null);
			member.removeBook(book);
			return true;
		}
		return false;

	}

	public List<String> getAvailableCotes() {
		List<String> availableCotes = new ArrayList<String>();

		for (Book book : this.getAvailableBooks()) {
			availableCotes.add(book.getCote());
		}

		return availableCotes;
	}

}
