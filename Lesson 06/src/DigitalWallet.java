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
	
}
