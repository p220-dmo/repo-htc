package fr.htc.library.data;

public class Book {
	private static int coteSeq = 10;
	private String cote;
	private String title;
	private String author;
	private int editionYear;

	// *** Constructors
	public Book() {
	}

	public Book(String title, String author, int editionYear) {
		this.title = title;
		this.author = author;
		this.editionYear = editionYear;
		this.cote = this.generateCote();
	}

	private String generateCote() {
		// TODO Cette doit �tre impl�ment�e
		return "" + Book.coteSeq;
	}

	// *** gettes & setters

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getEditionYear() {
		return editionYear;
	}

	public void setEditionYear(int editionYear) {
		this.editionYear = editionYear;
	}

	public String getCote() {
		return cote;
	}

}