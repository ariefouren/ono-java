
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for loop
		double pv = 10000;
		double rate = 0.06; // rate = 6%
		// אחרי כמה שנים הערך בתכנית ישליש את עצמו
		// fv >= 30000
		// nper = ?
		double fv = pv;
		int years = 0;
		while(fv < 30000)
		{
			fv = fv * (1 + rate); // * 1.06
			years++;
			System.out.printf("years = %5d  fv = %9.2f\n", years, fv);
		}
		
		System.out.printf("after %d year(s) fv is %7.3f", years, fv );
		/*
		for(int i = 1; i <= nper; i++) 
		{
			// fv[i] = fv[i-1] * (1 + rate)
			fv = fv * (1 + rate);
			System.out.printf("i = %5d  fv = %9.2f\n", i, fv);
		}
		*/
		
		
		
	}

}
