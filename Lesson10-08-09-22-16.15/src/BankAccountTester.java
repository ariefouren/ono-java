/*
 * BankAccountTester.java
 */
public class BankAccountTester {

	public static void main(String[] args) {
		BankAccount aliceAccount = new BankAccount(5000.0, 1017, "Alice");
		BankAccount bobAccount = new BankAccount(1021, "Bob");
		
		System.out.println("Two accounts are created: ");
		System.out.println(aliceAccount.toString());
		System.out.println(bobAccount.toString());

		System.out.println("Alice transfers half of her mony to Bob : ");
		double amount = aliceAccount.getBalance()/2;
		aliceAccount.withdraw(amount);
		bobAccount.deposit(amount);
		System.out.println(aliceAccount.toString());
		System.out.println(bobAccount.toString());
		
	}

}
