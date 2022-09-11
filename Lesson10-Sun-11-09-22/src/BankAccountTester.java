/*
 * BankAccountTester.java
 */
public class BankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount alicesAccount = new BankAccount(10000, 1001, "Alice");
		BankAccount bobsAccount = new BankAccount(0, 1002, "Bob");
		
		System.out.println("Accounts are created:");
		System.out.println(alicesAccount.toString());
		System.out.println(bobsAccount.toString());
		

		System.out.println("Alice transfers to Bob a half of her balance :");
		double aliceBalance = alicesAccount.getBalance();
		double amountToTransfer = aliceBalance/2;
		alicesAccount.withdraw(amountToTransfer);
		bobsAccount.deposit(amountToTransfer);
		System.out.println(alicesAccount.toString());
		System.out.println(bobsAccount.toString());
		
		
	}

}