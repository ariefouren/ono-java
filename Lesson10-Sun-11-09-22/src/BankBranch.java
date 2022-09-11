import java.util.ArrayList;

public class BankBranch {
	private ArrayList<BankAccount> accounts = new  ArrayList<BankAccount>();
	private String branchName;
	
	public BankBranch(String branchName) {
		this.branchName = branchName;
	}  
	
	public void addAccount(BankAccount a)
	{
		accounts.add(a); 
	}
	
	public double totalBalance()
	{
		double total = 0;
		for(BankAccount a: accounts)
		{
			total += a.getBalance();
		}
		
		return total;
		
	}
	
	

}
