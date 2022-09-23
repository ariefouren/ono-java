
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

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return String.format("RavKav [id=%s, balance=%s, bonusRate=%s]", id, balance, bonusRate);
	}

	
	

	
	
	
	

	
	

	
	
	
	

	
	
	
	
	
}
