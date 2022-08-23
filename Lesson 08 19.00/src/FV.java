import java.util.Scanner;
import java.util.Random;

public class FV {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random	rand = new Random();
		
		// user's input
		System.out.print("Enter the investment amount :");
		double pv = in.nextDouble();
		
		System.out.print("Enter the MEAN of the monthly rate (in %):");
		double meanRate = in.nextDouble()/100; // meanRate = 0.005 for 0.5%
		
		System.out.print("Enter the STDEV of the monthly rate (in %):");
		double stdevRate = in.nextDouble()/100; // stdevRate = 0.02 for 2%
		
		System.out.print("Enter the number of months :");
		int nper = in.nextInt();
		
		// computation
		double[] fv = new double[nper + 1];
		fv[0] = pv;
		for(int i = 1; i <= nper; i++)
		{
			double rate = meanRate + stdevRate*rand.nextGaussian(); 
			fv[i] = fv[i-1] * (1 + rate);
		}
		double totalInterest = fv[nper] - fv[0];
		double totalInterestRate = totalInterest/fv[0]*100; 
		
		// output
		System.out.printf("%15s | %15s\n", "Month", "FV");
		for(int i = 0; i <= nper; i++)
		{
			System.out.printf("%15d | %15.2f\n", i, fv[i]);
		}
		
		System.out.printf("Total interest earned: %7.2f NIS\n", totalInterest);
		System.out.printf("Total interest rate  : %7.2f %%\n", totalInterestRate);
		
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
