/*
 * BankAccount.java
 */
public class BankAccount {
	// משתנים פרטיים
	private double balance; 		// יתרה
	private int accountNumber; 		// מספר חשבון
	private String customerName; // שם של בעלי החשבון
	
	// מתודות ציבוריות
	public BankAccount(double balance, int accountNumber, String customerName) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}
	
	public BankAccount(int accountNumber, String customerName) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}


	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	
	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return String.format("BankAccount [balance=%10.2f, accountNumber=%10d, customerName=%15s]", 
				balance, 
				accountNumber,
				customerName);
	}
	
	
	
	
	
}