package fr.htc.library.dao;

import java.util.HashMap;
import java.util.Map;

import fr.htc.library.data.Book;
import fr.htc.library.data.Member;

public class Storage {
	
	private static Map<String, Member> memberDB = new HashMap<>();
	private static Map<String, Book> bookDB = new HashMap<>();
	
	public static Map<String, Member> getMemberDB() {
		return memberDB;
	}
	public static Map<String, Book> getBookDB() {
		return bookDB;
	}
	

	

}
