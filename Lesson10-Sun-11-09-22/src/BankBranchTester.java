
public class BankBranchTester {

	public static void main(String[] args) {
		
		BankBranch branchJerusalem987 = new BankBranch("987 Jerusalem Jaffa 123");
		
		BankAccount alicesAccount = new BankAccount(10000, "1001", "Alice");
		BankAccount bobsAccount = new BankAccount("1002", "Bob");
		BankAccount cyndisAccount = new BankAccount(100000, "1003", "Cyndi");
		
		branchJerusalem987.addAccount(alicesAccount);
		branchJerusalem987.addAccount(bobsAccount);
		branchJerusalem987.addAccount(cyndisAccount);
		
		System.out.printf("%s", branchJerusalem987.toString()); 
		
		// find account with number "1003"
		String accNumber = "1003";
		BankAccount account = branchJerusalem987.findAccount(accNumber);
		if(account != null)
		{
			System.out.printf("Account %s found:\n %s\n", accNumber, account.toString());
		}
		else
		{
			System.out.printf("Account %s NOT found\n", accNumber, account.toString());
		}

	}

}
