
public class RavKav {
	private int id;
	private double balance;
	private double bonusRate;
	
	public RavKav(int id, double bonusRate) {
		this.id = id;
		this.bonusRate = bonusRate;
		this.balance = 0;
	}
	
	public void charge(double amount)
	{
		balance += amount * (1 + bonusRate);
	}
	
	public boolean pay(double amount)
	{
		if(balance >= amount)
		{
			balance -= amount;
			return true;
		}
		else // balance < amount
		{
			return false;
		}
	}
	
	

	
	

	
	
	
	

	
	
	
	
	
}
