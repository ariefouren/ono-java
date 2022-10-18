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
	
	public double getShippingCost()
	{
		return books.size() * 15.0;
	}
	
	public double getGrandTotal()
	{
		return getSubTotal() + getShippingCost();
	}
	
	public String toString()
	{
		String str = "";
		str += String.format("Order: %d  Date: %s", orderNumber, date) + "\n";
		str += "--------------------------------------\n";
		
		for(Book x: books)
		{
			str += x.toString() + "\n";
		}
		str += "--------------------------------------\n";
		
		str += String.format("Sub-Total      : %9.2f:\n", getSubTotal()) + "\n";
		str += String.format("Shipping Cost  : %9.2f:\n", getShippingCost()) + "\n";
		str += String.format("Grand Total    : %9.2f:\n", getGrandTotal()) + "\n";
		
		return str;
	}
	
	
	
	
}
