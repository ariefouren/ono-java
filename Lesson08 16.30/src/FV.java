import java.util.Scanner;
import java.util.Random;

public class FV {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random  rand = new Random();
		
		// user's input
		System.out.print("Enter the investment amount :");
		double pv = in.nextDouble();

		System.out.print("Enter the MEAN of the monthly interest rate (in %):");
		double meanRate = in.nextDouble()/100;
		
		System.out.print("Enter the STDEV of the monthly interest rate (in %):");
		double stdevRate = in.nextDouble()/100;
		
		System.out.print("Enter the number of months :");
		int nper = in.nextInt();
		
		// computations
		double[] fv = new double[nper+1];	// fv[i] ערך עתידי של החסכון 
											// i חודשים אחרי ההפקדה
		fv[0] = pv;
		for(int i = 1; i <= nper; i++)
		{
			double rate = rand.nextGaussian(meanRate, stdevRate);
			fv[i] = fv[i-1]*(1 + rate);
		}
	
		// output
		for(int i = 0; i <= nper; i++)
		{
			System.out.printf("%7d | %7.2f\n", i, fv[i]);
		}
	
		// graphic output
		StdDraw.setXscale(0, nper);
		StdDraw.setYscale(0, fv[nper]);
		StdDraw.setPenColor(StdDraw.RED);
		for(int i = 0; i < nper; i++)
		{
			 StdDraw.line(i, fv[i], i+1, fv[i+1]);
		}
		
	}

}
