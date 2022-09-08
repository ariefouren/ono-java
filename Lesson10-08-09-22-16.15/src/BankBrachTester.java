/*
 * BankBrachTester.java
 */
public class BankBrachTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankBranch branch971 = new BankBranch("971 Ha-Yarden 89 TA");
		
		BankAccount aliceAccount = new BankAccount(5000.0, 1017, "Alice");
		BankAccount bobAccount = new BankAccount(1021, "Bob");
		BankAccount cydniccount = new BankAccount(90000, 1027, "Cyndi");
		
		branch971.addAccount(aliceAccount);
		branch971.addAccount(bobAccount);
		branch971.addAccount(cydniccount);
		
		System.out.printf("%s", branch971.toString());
		
		
	}

}
