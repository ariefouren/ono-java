public class BankAccount {
	private double balance; // יתרה
	private int accountNumber; // מספר חשבון
	private String customerName; // שם של בעלי החשבון
	
	public BankAccount(double balance, int accountNumber, String customerName) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}

	public BankAccount(int accountNumber, String customerName) {
		this.balance = 0;  // default
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	
	
	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	@Override
	public String toString() {
		return String.format("BankAccount [balance=%12.2f, accountNumber=%7d, customerName=%10s]", 
				balance, 
				accountNumber,
				customerName);
	}	
}
