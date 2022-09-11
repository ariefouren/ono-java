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
	
	public String toString()
	{
		String str = "";
		str += "-----------------------------------------------------------------------------\n";
		str += branchName + "\n"; 
		str += "-----------------------------------------------------------------------------\n";
		for(BankAccount a: accounts)
		{
			str += a.toString() + "\n";
		}
		str += "-----------------------------------------------------------------------------\n";
		str += String.format("Number of accounts :     %10d\n", accounts.size());
		str += String.format("Total balance      :     %10.2f\n", totalBalance());
		str += "-----------------------------------------------------------------------------\n";
		
		
		return str;
	}
	
	

}
