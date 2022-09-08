import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		final int MAX_LENGTH = 500;
		double[] prices = new double[MAX_LENGTH];
		
		Scanner input = new Scanner(System.in);
		
		// user's input
		System.out.println("Enter the list of prices, Q to quit");
		int numItems = 0; // the number of items in the order
							// numItems is equal to the 
							// index of the first empty place
		
		while(input.hasNextDouble() && numItems < prices.length)
		{
			prices[numItems] = input.nextDouble();
			numItems++;
		}
		input.next();  // clear Q from the scanner
		
		// calculations
		double sum = prices[0];
		double min = prices[0];
		double max = prices[0];
		for(int i = 1; i < numItems; i++)
		{
			sum += prices[i];
			if(min > prices[i])
			{
				min = prices[i];
			}
			if(max < prices[i])
			{
				max = prices[i];
			}
		}
		double average = sum/numItems;
			
		// output
		System.out.println("The list of the prices :");
		for(int i = 0; i < numItems; i++)
		{
			System.out.printf("%9.2f\n", prices[i]);
		}
		// print the statistics
		System.out.printf("Number of items:      %9d\n", numItems);
		System.out.printf("Total price    :      %9.2f\n", sum);
		System.out.printf("Min price      :      %9.2f\n", min);
		System.out.printf("Max price      :      %9.2f\n", max);
		System.out.printf("Average price  :      %9.2f\n", average);

	}

}
