
public class Arrays {

	public static void main(String[] args) {
		double[] a = {1.2, 3.4, 7.9, 90.9, -20, 24, 56, 12.3};
		
		// find the max value in the array
		// a.length - num of elements in the array
		double max = a[0];
		for(int i = 1; i < a.length; i++)
		{
			if(max < a[i])
			{
				max = a[i];
			}
		}
		System.out.printf("max = %f", max);
		
		/*
		double[] a = new double[100];
		
		// computation
		for(int i = 0; i < 100; i++)
		{
			a[i] = i*i;
		}
		
		// compute the sum of the elements
		double sum = 0;
		for(int i = 0; i < 100; i++)
		{
			sum = sum + a[i];
		}
		// output
		System.out.printf("sum = %.2f", sum);
	*/
	}

}
