import java.util.Scanner;  

public class Order {

	public static void main(String[] args) {
		final int MAX_NUM_ITEMS = 1000;
		double[] prices = new double[MAX_NUM_ITEMS];
		
		Scanner in = new Scanner(System.in);
		// user's input
		System.out.print("Please enter the list of the prices, Q to quit");
		int numItems = 0;
		while(in.hasNextDouble()  && numItems < MAX_NUM_ITEMS)
		{
			 prices[numItems]= in.nextDouble();
			 numItems++;
		}
		
		// calculations
		double min = prices[0];
		double max = prices[0];
		double sum = prices[0];
		for(int i = 1; i < numItems; i++)
		{
			if(prices[i] < min)
			{
				min = prices[i];
			}
			if(max < prices[i])
			{
				max = prices[i];
			}
			sum += prices[i];
		}
		double average = 0;
		if(numItems >0)
		{
			average = sum/numItems;		
		}
		
		// output
		for(int i = 0; i < numItems; i++)
		{
			System.out.printf("%7.2f\n", prices[i]);
		}
		
		// print the statistics
		System.out.printf("     Num of items     :  %7d\n", numItems);
		System.out.printf("     Total price      :  %7.2f\n", sum);
		System.out.printf("     Min price        :  %7.2f\n", min);
		System.out.printf("     Max price        :  %7.2f\n", max);
		System.out.printf("     Average price    :  %7.2f\n", average);
		

	}

}
