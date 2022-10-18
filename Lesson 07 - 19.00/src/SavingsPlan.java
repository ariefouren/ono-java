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
	int nper  = input.nextInt() * 12; // nper = number of months
	
	// computations
	double fv1 = pmt * (Math.pow((1 + rate), nper) - 1)/rate; 
	// fv = pmt * ((1 + rate)^n - 1)/rate
	
	double totalPMT =  nper * pmt;
	
	double interestEarned = fv1 - totalPMT; 
	
	double[] fv = new double[nper + 1];
	fv[0] = 0;
	for(int i = 1; i <= nper; i++ )
	{
		fv[i] = fv[i-1] * (1 + rate) + pmt;
	}
	// output
	System.out.printf("The future value after %d years:  %7.2f\n",
		nper/12, fv1);
	System.out.printf("The total amount of payments :    %7.2f\n",
			totalPMT);
	System.out.printf("The total interest earned:        %7.2f\n",
			interestEarned);
	
	

	}

}
