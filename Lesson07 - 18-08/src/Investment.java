import java.util.Scanner;
import java.util.Random;

public class Investment {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		// user's input
		System.out.print("Enter the investment amount :");
		double pv  = in.nextDouble();
		
		System.out.print("Enter the MEAN of the monthly interest rate (in %):");
		double meanRate  = in.nextDouble()/100; // meanRate - 0.005
		
		System.out.print("Enter the STDEV of the monthly interest rate (in %):");
		double stdevRate  = in.nextDouble()/100; // stdevRate - 0.005
		
		System.out.print("Enter the number of months:");
		int nper  = in.nextInt(); 
		
		double[] fv = new double[nper + 1];
		// fv[i] - future value i months after the investment
		
		
		
		// computation
		fv[0] = pv;
		for(int i = 1; i <= nper;  i++)
		{
			fv[i] = fv[i-1] * (1 + 0.005); // r = 0.005 
			System.out.printf(" month = %7d  fv = %9.2f\n", i, fv[i]);
		}
		
		
		// output
		
		
	}

}
