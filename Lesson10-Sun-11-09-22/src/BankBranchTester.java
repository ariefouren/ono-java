
public class BankBranchTester {

	public static void main(String[] args) {
		
		BankBranch branchJerusalem987 = new BankBranch("987 Jerusalem Jaffa 123");
		
		BankAccount alicesAccount = new BankAccount(10000, 1001, "Alice");
		BankAccount bobsAccount = new BankAccount(1002, "Bob");
		BankAccount cyndisAccount = new BankAccount(100000, 1003, "Cyndi");
		
		branchJerusalem987.addAccount(alicesAccount);
		branchJerusalem987.addAccount(bobsAccount);
		branchJerusalem987.addAccount(cyndisAccount);
		
		System.out.printf("%s", branchJerusalem987.toString()); 

	}

}
