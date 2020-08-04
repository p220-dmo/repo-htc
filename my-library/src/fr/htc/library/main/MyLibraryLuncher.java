package fr.htc.library.main;

import fr.htc.library.data.Book;
import fr.htc.library.data.Member;

public class MyLibraryLuncher {

	public static void main(String[] args) {
		
		
		Book book = new Book("title", "author", 2020);
		Book book1 = new Book("title", "author", 2020);
		
		System.out.println(book.getCote());
		System.out.println(book1.getCote());
		
		Member member = new Member("retima", "raouf");
		Member member1 = new Member("mochene","djamel",33);
		
	    System.out.println(member.getMatricule());
		System.out.println(member1.getMatricule()); 

	}

}
