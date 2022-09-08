
public class Loops {

	public static void main(String[] args) {
		// 
		double investment = 10000;
		double rate = 0.06; // r = 6%
		double desiredFV = 20000; //fv = 20000
		// nper = ?
		int nper = 0;
		while(investment < desiredFV)
		{
			investment = investment * (1 + rate); // * (1 + r)
			nper++;
			System.out.printf("after %d year(s) fv = %.2f\n", nper, investment );
		}
		
		
		/*
		// fv_10 = ?
		int nper = 10;
		for(int i = 1; i <= nper; i++)
		{
			investment = investment * (1 + rate);
			System.out.printf("after %d year(s) fv = %f\n", i, investment );
		}
		*/

	}

}
