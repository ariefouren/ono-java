/*
 * BankAccountTester.java
 */
public class BankAccountTester {

	public static void main(String[] args) {
		BankAccount aliceAccount = new BankAccount(5000.0, 1023, "Alice");
		BankAccount bobAccount = new BankAccount(1024, "Bob");
		
		System.out.println("Two acounts created :");
		System.out.println(aliceAccount.toString());
		System.out.println(bobAccount.toString());
		
		System.out.println("Alice transfers to Bob half of her savings :");
		double amount = aliceAccount.getBalance()/2;
		aliceAccount.withdraw(amount);
		bobAccount.deposit(amount);
		System.out.println(aliceAccount.toString());
		System.out.println(bobAccount.toString());
	
	}

}
