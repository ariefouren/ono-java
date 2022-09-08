import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// array of doubles
		double[] a = new double[100];
		
		double[] rate = {0.06, 0.04, 0.01, -0.02, -0.07, -0.08, 0.01, 0.12};
		
		// find the max element in the array rate
		double max = rate[0];
		for(int i = 1; i < rate.length; i++)
		{
			if(max < rate[i])
			{
				max = rate[i];
			}
		}
		System.out.printf("max = %f", max);
		
		
		
	}

}
