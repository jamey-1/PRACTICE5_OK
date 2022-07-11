package practice5.exercise1;

public class testBook {
	
	public static void main(String[] args) {
		
		Book book1 = new Book();
		System.out.println(book1.toString());
		
		Book book2 = new Book("Java", "James Gosling", 2, 0);
		System.out.println(book2.toString());
		
		book1.setTitle("C");
		book1.setAuthor("Dennis Ritchie");
		book1.setCopies(2);
		book1.setLentCopies(0);
		
		System.out.println();
		
		System.out.println("Title: " + book1.getTitle());
		System.out.println("Author: " + book1.getAuthor());
		System.out.println("Copies: " + book1.getCopies());
		System.out.println("LentCopies: " + book1.getLentCopies());
		
		System.out.println();
		
		System.out.println(book2.loanBook());
		System.out.println(book2.loanBook());
		System.out.println(book2.loanBook());
		System.out.println(book2.loanBook());
		
		System.out.println();
		
		System.out.println(book2.returnBook());
		System.out.println(book2.returnBook());
		System.out.println(book2.returnBook());
		System.out.println(book2.returnBook());
		
		System.out.println();
		
		System.out.println(book2.loanBook());
		System.out.println(book2.getLentCopies());
	}
	
}
