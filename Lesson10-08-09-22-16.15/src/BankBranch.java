/*
 * BankBranch.java
 */
import java.util.ArrayList;

public class BankBranch {
	private String branchName;
	private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	
	public BankBranch(String branchName) {
		this.branchName = branchName;
	}
	
	public void addAccount(BankAccount account)
	{
		accounts.add(account);
	}
	
	public double totalBalance()
	{
		double sum = 0;
		for(BankAccount account: accounts)
		{
			sum = sum + account.getBalance();
		}
		return sum;		
	}
	
	public String toString()
	{
		String str = "";
		for(BankAccount account: accounts)
		{
			str = str + account.toString() + "\n";
		}
		return str;		
	}
	
	

}
