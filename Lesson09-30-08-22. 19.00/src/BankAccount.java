/*
 * BankAccount.java
 */
public class BankAccount {

	private double balance; // יתרה
	private int accountNumber; // מספר חשבון
	private String customerName; // שם של הלקוח
	
	public BankAccount(double balance, int accountNumber, String customerName) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}

	public BankAccount(int accountNumber, String customerName) {
		this.balance = 0; // יתרה ברירת מחדל
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}

	@Override
	public String toString() 
	{
		return String.format("BankAccount [balance=%s, accountNumber=%s, customerName=%s]", balance, accountNumber,
				customerName);
	}
	
	
	
	
	
	
	
	
	
}
