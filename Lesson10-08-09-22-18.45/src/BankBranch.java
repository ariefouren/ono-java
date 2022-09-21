/*
 * BankBranch.java
 * TIGBUR 21-09-22
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
	
	public BankAccount findAccount(String accountNumber)
	{
		for(BankAccount a: accounts)
		{
			if(a.getAccountNumber().equals(accountNumber)) return a;
		}
		return null;
	}
	
	public double totalBalance()
	{
		double total  = 0;
		
		for(BankAccount a: accounts)
		{
			total += a.getBalance();
		}
		
		return total;
		
	}
	
	public String toString()
	{
		String str  = "";
		str += "-----------------------------------------------------------------------------------\n";
		str += branchName + "\n";
		str += "-----------------------------------------------------------------------------------\n";
		
		for(BankAccount a: accounts)
		{
			str  += a.toString() + "\n";
		}
		str += "-----------------------------------------------------------------------------------\n";
		str += String.format("Number of accounts : %d\n", accounts.size());
		str += String.format("Total balance : %10.2f\n", totalBalance());
		str += "-----------------------------------------------------------------------------------\n";
		
		return str;
	}
	
	
	
	
	
	
	

}
