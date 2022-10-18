
public class Book {
	private String title;
	private String author;
	private int numPages;
	
	public Book(String title, String author, int numPages) {
		this.title = title;
		this.author = author;
		this.numPages = numPages;
	}
	
	public double getPrice()
	{
		double price =0;
		if(numPages <= 500)
		{
			price = numPages * 0.1;
		}
		else // numPages > 500
		{
			price = 500 * 0.1 + (numPages - 500) * 0.04;
		}
		
		return price;
		
	}

	@Override
	public String toString() {
		return String.format("Book [title=%20s,"
				+ " author=%20s, "
				+ "numPages=%4d, "
				+ "price=%7.2f]", title, author, numPages,
				getPrice());
	}
	
	

}
