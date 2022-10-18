import java.util.Scanner;

public class SavingsPlan {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	// user's input
	System.out.printf("Please enter monthly deposit amount: ");
	double pmt = input.nextDouble();
	
	System.out.printf("Please enter annual rate (%%): ");
	double rate  = input.nextDouble()/12/100; // r = monthly rate, 0.005	
	
	System.out.printf("Please enter the number of years: ");
	int nper  = input.nextInt() * 12;
	
	// computations
	double fv = pmt * (Math.pow((1 + rate), nper) - 1)/rate; 
	// fv = pmt * ((1 + rate)^n - 1)/rate
	
	// output
	System.out.printf("The future value after %d years: %7.2f\n",
		nper/12, fv);
	

	}

}
