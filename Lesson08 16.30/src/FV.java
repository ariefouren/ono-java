import java.util.Scanner;
import java.util.Random;

public class FV {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random  rand = new Random();
		
		// user's input
		System.out.print("Enter the investment amount :");
		double pv = in.nextDouble();

		System.out.print("Enter the MEAN of the monthly interest rate :");
		double meanRate = in.nextDouble();
		
		System.out.print("Enter the STDEV of the monthly interest rate :");
		double stdevRate = in.nextDouble();
		
		System.out.print("Enter the number of months :");
		int nper = in.nextInt();
		
		// computations
		double[] fv = new double[nper+1];	// fv[i] ערך עתידי של החסכון 
											// i חודשים אחרי ההפקדה
		fv[0] = pv;
		for(int i = 1; i <= nper; i++)
		{
			double rate = 0.01; //r = 1%
			fv[i] = fv[i-1]*(1 + rate);
			System.out.printf("i = %7d  fv = %7.2f\n", i, fv[i]);
		}
		
		
		// output

	}

}
