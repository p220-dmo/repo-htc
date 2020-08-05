package fr.htc.library.main;

import fr.htc.library.dao.Storage;
import fr.htc.library.services.BookService;
import fr.htc.library.services.CheckoutService;
import fr.htc.library.services.MemberService;
import fr.htc.library.services.impl.BookServiceImpl;
import fr.htc.library.services.impl.CheckoutServiceImpl;
import fr.htc.library.services.impl.MemberServiceImpl;

public class MyLibraryLuncher {
	private static MemberService memberService = new MemberServiceImpl();
	private static BookService bookService = new BookServiceImpl();
	private static CheckoutService checkoutService = new CheckoutServiceImpl();

	public static void main(String[] args) {
		
		memberService.addMember("Djamel", "MOUCHENE", 37);
		memberService.addMember("Liza", "SEGOUANE", 28);
		memberService.addMember("Raouf", "RETIMA", 39);
		System.out.println(Storage.getMemberDB().keySet());

		
		
		bookService.addBook("Nedjma", "Kateb yacine", 1985);
		bookService.addBook("L'Alcjimiste", "Paolo Cohlo", 1994);
		bookService.addBook("Le fils du pauvre", "Mouloud FERAOUNE", 1985);
		bookService.addBook("Leon l'africain", "Amine Maalouf", 1985);
		bookService.addBook("L'incendie", "Mohamed DIB", 1985);
		System.out.println(Storage.getBookDB().keySet());
		
		checkoutService.checkout("DM100", "MO85-12");
		checkoutService.checkout("DM100", "KA85-10");
		checkoutService.checkout("DM100", "PA94-11");
		
		checkoutService.checkout("DM100", "AM85-13");

		checkoutService.checkIn("DM100", "PA94-11");
		
		checkoutService.checkout("DM100", "AM85-13");
		
		
		
		
		/*
		
		Book book1  = new Book("Nedjma", "Kateb yacine", 1985);
		Book book2  = new Book("Nedjma", "Kateb yacine", 1985);
		Book book3  = new Book("l'alchimiste", "paulo coello", 1994);
		Book book4  = new Book("Nedjma", "Kateb yacine", 1985);
		Book book5  = new Book("Nedjma", "Kateb yacine", 1985);
		Book book6  = new Book("Nedjma", "Kateb yacine", 1985);
		Book book7  = new Book("Nedjma", "Kateb yacine", 1985);
		Book book8  = new Book("Nedjma", "Kateb yacine", 1985);
		Book book9  = new Book("Nedjma", "Kateb yacine", 1985);
		Book book10 = new Book("Nedjma", "Kateb yacine", 1985);
		Book book11 = new Book("Nedjma", "Kateb yacine", 1985);
		Book book12 = new Book("Nedjma", "Mohamed DIB", 1985);
		Book book13 = new Book("Nedjma", "Kateb yacine", 1985);
		Book book14 = new Book("Nedjma", "Kateb yacine", 1985);
		Book book15 = new Book("Nedjma", "Kateb yacine", 1985);

		Member member1   = new Member ("Yacine", "SEGHOUANE");
		Member member2   = new Member ("Djamel", "mouchene");
		Member member3   = new Member ("Ali", "SEGHOUANE");
		Member member4   = new Member ("Yacine", "SEGHOUANE");
		Member member5   = new Member ("Yacine", "SEGHOUANE");
		Member member6   = new Member ("Yacine", "SEGHOUANE");
		Member member7   = new Member ("Yacine", "SEGHOUANE");
		Member member8   = new Member ("Yacine", "SEGHOUANE");
		Member member9   = new Member ("Yacine", "SEGHOUANE");
		Member member10  = new Member ("Yacine", "SEGHOUANE");
		Member member11  = new Member ("Yacine", "SEGHOUANE");
		

		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println(book4);
		System.out.println(book5);
		System.out.println(book6);
		System.out.println(book7);
		System.out.println(book8);
		System.out.println(book9);
		System.out.println(book10);
		System.out.println(book11);
		System.out.println(book12);
		System.out.println(book13);
		System.out.println(book14);
		System.out.println(book15);
		
		System.out.println(member1);
		System.out.println(member2);
		System.out.println(member3);
		System.out.println(member4);
		System.out.println(member5);
		System.out.println(member6);
		System.out.println(member7);
		System.out.println(member8);
		System.out.println(member9);
		System.out.println(member10);
		System.out.println(member11);
*/
	}

}
