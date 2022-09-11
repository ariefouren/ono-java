
public class BankBranchTester {

	public static void main(String[] args) {
		
		BankBranch branchJerusalem987 = new BankBranch("987 Jerusalem Jaffa 123");
		
		BankAccount alicesAccount = new BankAccount(10000, 1001, "Alice");
		BankAccount bobsAccount = new BankAccount(1002, "Bob");
		
		branchJerusalem987.addAccount(aliceAccount);
		branchJerusalem987.addAccount(bobAccount);

	}

}
