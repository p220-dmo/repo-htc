package fr.htc.library.data;

public class Book {
	
	private static int coteSeq = 10;
	private String cote;
	private String title;
	private String author;
	private int editionYear;
	private Member borrower;


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
		String cote = this.author.substring(0, 2).toUpperCase() + this.editionYear%100 + "-" + coteSeq++;

		return cote;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((cote == null) ? 0 : cote.hashCode());
		result = prime * result + editionYear;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (cote == null) {
			if (other.cote != null)
				return false;
		} else if (!cote.equals(other.cote))
			return false;
		if (editionYear != other.editionYear)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public Member getBorrower() {
		return borrower;
	}

	public void setBorrower(Member borrower) {
		this.borrower = borrower;
	}
	@Override
	public String toString() {
		return "Book [cote=" + cote + ", title=" + title + ", author=" + author + ", editionYear=" + editionYear + "]";
	}

	public boolean isAvailable() {
		if(this.borrower == null) {
			return true;
		}
		return false;
	}
	
		
	
}
