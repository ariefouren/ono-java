
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find the maximal value in the array
		
		double[] a = {-12, 13.90, 27.99, -30.7, -0.01, 0.0001, 3, 4, 5, 65, 78, 90};
		double max = a[0];
		for(int i = 1; i < a.length; i++)
		{
			if(max < a[i])
			{
				max = a[i];
			}
		}
		System.out.printf("max = %.2f", max);
	}

}
