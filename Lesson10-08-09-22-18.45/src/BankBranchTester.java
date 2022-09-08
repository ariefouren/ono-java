/*
 * BankBranchTester.java
 */
public class BankBranchTester {

	public static void main(String[] args) {

		BankBranch branchTA987 = new BankBranch("987 TA Ha-Yarden 654");

		BankAccount aliceAccount = new BankAccount(5000.0, 1023, "Alice");
		BankAccount bobAccount = new BankAccount(1024, "Bob");
		BankAccount cyndiAccount = new BankAccount(12000, 1025, "Cyndi");
		
		branchTA987.addAccount(aliceAccount);
		branchTA987.addAccount(bobAccount);
		branchTA987.addAccount(cyndiAccount);
		
		System.out.print(branchTA987.toString());
	}

}
