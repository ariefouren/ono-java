
import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int MAX_NUM_ITEMS = 5;
		double[] prices = new double[MAX_NUM_ITEMS];
		int numOfItems =0; // numOfItems is equal to the first empty place in the array
		
		// user's input
		System.out.println("Enter the list of the prices, Q to quit");
		while(numOfItems < MAX_NUM_ITEMS && in.hasNextDouble() )
		{
			prices[numOfItems] = in.nextDouble();
			numOfItems++;
		}
		in.next();
		
		// calculate the statistics
		double sum = prices[0];
		double min = prices[0];
		double max = prices[0];
		
		for(int i = 1; i < numOfItems; i++ )
		{
			sum += prices[i];
			if(prices[i] < min)
			{
				min = prices[i];
			}
			if(max < prices[i])
			{
				max = prices[i];
			}
		}
		double average = sum/numOfItems; // 0/0
		
		// output
		System.out.printf("List of the prices:\n");
		for(int i = 0; i < numOfItems; i++)
		{
			System.out.printf("i = %d price = %f\n", i, prices[i]);
		}
		
		System.out.printf("Num of items:       %7d\n", numOfItems);
		System.out.printf("Total price:        %7.2f\n", sum);
		System.out.printf("Min price:          %7.2f\n", min);
		System.out.printf("Max price:          %7.2f\n", max);
		System.out.printf("Average price:      %7.2f\n", average);
	}

}