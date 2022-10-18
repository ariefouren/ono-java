import java.util.ArrayList;

public class BookOrder {
	private int orderNumber;
	private String date;
	ArrayList<Book> books = new ArrayList<Book>();
	
	public BookOrder(int orderNumber, String date) {
		this.orderNumber = orderNumber;
		this.date = date;
	}
	
	public void addBook(Book book)
	{
		books.add(book);
	}
	
	public double getSubTotal()
	{
		double totalPrice =0;
		for(Book x: books)
		{
			totalPrice += x.getPrice();
		}
		return totalPrice;
	}
	
	
	
	
}
