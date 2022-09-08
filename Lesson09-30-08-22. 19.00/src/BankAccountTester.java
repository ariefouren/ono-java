/*
 * BankAccountTester.java
 */
public class BankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount aliceAccount = new BankAccount(10000.0, 1003, "Alice"); 
		BankAccount bobAccount = new BankAccount(1005, "Bob");
		
		// output
		System.out.println(aliceAccount.toString());
		System.out.println(bobAccount.toString());
	}

}
