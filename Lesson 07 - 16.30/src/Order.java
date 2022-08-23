import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int MAX_NUM_ITEMS = 1000;
		double[] prices = new double[MAX_NUM_ITEMS];
		int numOfItems =0; // numOfItems is equal to the first empty place in the array
		
		// user's input
		System.out.println("Enter the list of the prices, Q to quit");
		while(in.hasNextDouble())
		{
			prices[numOfItems] = in.nextDouble();
			numOfItems++;
		}
		// calculate the statistics
		
		// output
		for(int i = 0; i < numOfItems; i++)
		{
			System.out.printf("i = %d price = %f\n", i, prices[i]);
		}
		

	}

}
