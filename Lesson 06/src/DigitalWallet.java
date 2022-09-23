/*
 * DigitalWallet.java
 */
import java.util.ArrayList;
public class DigitalWallet {
	ArrayList<RavKav> cards = new ArrayList<RavKav>(); 
	
	public void addCard(RavKav card)
	{
		cards.add(card);
	}
	
	public RavKav find(int id)
	{
		for(RavKav r : cards)
		{
			if(r.getId() == id) return r; 
		}
		
		return null;

	}
	
	public boolean charge(int id, double amount)
	{
		RavKav r = find(id);
		if( r != null )
		{
			r.charge(amount);
			return true;
		}
		else // r == null
		{
			System.out.printf("Error: card %d not found", id);
			return false;
		}
		
	}
	
	public boolean pay(int id, double amount)
	{
		RavKav r = find(id);
		
		if( r != null ) // rav kav found 
		{
			if( r.pay(amount) == true )
			{
				return true;
			}
			else //  r.pay() == false
			{
				System.out.printf("Error: the balance of card %d is too low\n", id);
				return false;
			}
		}
		else // r == null
		{
			System.out.printf("Error: card %d not found", id);
			return false;
		}
	}
	
	public double getTotalBalance()
	{
		double total = 0;
		for(RavKav r : cards)
		{
			total += r.getBalance();
		}
		
		return total;
	}
	
	public String toString()
	{
		String str = "";
		str += "Digital Wallet \n";

		for(RavKav r : cards)
		{
			str += r.toString() +"\n";
		}
		str += "-------------------------\n";
		str += String.format("Total balance : %7.2f\n", getTotalBalance());
		return str;
	}
	
}
