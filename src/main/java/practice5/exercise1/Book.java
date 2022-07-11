package practice5.exercise1;

public class Book {
	private String title;
	private String author;
	private int copies;
	private int lentCopies;
	
	public Book() {
		super();
	}

	public Book(String title, String author, int copies, int lentCopies) {
		super();
		this.title = title;
		this.author = author;
		this.copies = copies;
		this.lentCopies = lentCopies;
	}

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

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public int getLentCopies() {
		return lentCopies;
	}

	public void setLentCopies(int lentCopies) {
		this.lentCopies = lentCopies;
	}
	
	public boolean loanBook() {
		if (lentCopies < copies) {
			lentCopies++;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean returnBook() {
		if (lentCopies > 0) {
			lentCopies--;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", copies=" + copies + ", lentCopies=" + lentCopies
				+ "]";
	}
	
	
	
	
}
