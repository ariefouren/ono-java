/*
 * BookOrderTester.java
 */
public class BookOrderTester {

	public static void main(String[] args) {
		
		Book book1 = new Book("Java Concepts", "Cay S. Horstmann", 400);
		Book book2 = new Book("Thinking in Java", "Bruce Eckel", 1500);
		Book book3 = new Book("Java, How to Program", "P. Deitel, H. Deitel", 1200);
		Book book4 = new Book("Effective Java", "Joshua Bloch", 500);
		Book book5 = new Book("Java: A Beginner’s Guide", "Herbert Schildt", 900);
		
		BookOrder javaBooks = new BookOrder(12407, "24-Aug-2021");
		javaBooks.addBook(book1);
		javaBooks.addBook(book2);
		javaBooks.addBook(book3);
		javaBooks.addBook(book4);
		javaBooks.addBook(book5);
		
		System.out.print(javaBooks.toString());

	}
}
