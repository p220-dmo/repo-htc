package fr.htc.library.services.impl;

import java.util.ArrayList;
import java.util.List;

import fr.htc.library.dao.BookDao;
import fr.htc.library.dao.MemberDao;
import fr.htc.library.dao.impls.BookDaoMapImp;
import fr.htc.library.dao.impls.MemberDaoMapImp;
import fr.htc.library.data.Book;
import fr.htc.library.data.Member;
import fr.htc.library.services.CheckoutService;

public class CheckoutServiceImpl implements CheckoutService {
	private MemberDao memberDao = new MemberDaoMapImp();
	private BookDao bookDao = new BookDaoMapImp();

	@Override
	public boolean checkout(String matricule, String cote) {
		Member member = memberDao.findMemberByMatricule(matricule);
		Book book = bookDao.findBookByCote(cote);

		if (book.isAvailable() & member.canCheckout()) {
			book.setBorrower(member);
			member.getBorrowedBooks().add(book);
			System.out.println("Succees");
			return true;
		}
		System.out.println("failed");
		return false;
	}

	@Override
	public List<Book> getAvailableBooks() {
		return bookDao.findAvailableBooks();
	}

	@Override
	public List<Book> getUnvailableBooks() {
		return bookDao.findUnvailableBooks();
	}

	@Override
	public boolean checkIn(String matricule, String cote) {
		Member member = memberDao.findMemberByMatricule(matricule);
		Book book = bookDao.findBookByCote(cote);

		if (book.getBorrower().getMatricule() == member.getMatricule() && member.getBorrowedBooks().contains(book)) {
			book.setBorrower(null);
			member.removeBook(book);
			return true;
		}
		return false;

	}

	@Override
	public List<String> getAvailableCotes() {
		List<String> availableCotes = new ArrayList<String>();
		
		for (Book book : this.getAvailableBooks()) {
			availableCotes.add(book.getCote());
		}

		return availableCotes;
	}

}
