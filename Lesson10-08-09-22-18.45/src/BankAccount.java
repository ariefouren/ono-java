/*
 * BankAccount.java
 * TIGBUR 21-09-22
 */
public class BankAccount {
	private double balance; // יתרה
	private String accountNumber; // מספר חשבון
	private String customerName; // שם של בעלי החשבון
	
	public BankAccount(double balance, String accountNumber, String customerName) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}

	public BankAccount(String accountNumber, String customerName) {
		this.balance = 0;  // default
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}

	public boolean deposit(double amount)
	{
		balance = balance + amount;
		return true;
	}

	public boolean withdraw(double amount)
	{
		if(balance - amount >= 0)
		{
			balance -= amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	public double getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	@Override
	public String toString() {
		return String.format("BankAccount [balance=%12.2f, accountNumber=%7s, customerName=%10s]", 
				balance, 
				accountNumber,
				customerName);
	}	
}
