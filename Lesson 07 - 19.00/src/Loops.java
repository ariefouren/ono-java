
public class Loops {

	public static void main(String[] args) {
		double pv = 30000;
		double rate = 0.06; // 6%
		int nper = 10;
		// א. מהו הערך העתיד עשר שנים אחרי ההפקדה ?
		// ב. תוך כמה שנים התכנית תכפיל את עצמה ?
		double fv = pv;
		int years =0;
		while(fv < 2 * pv)
		{
			fv = fv * (1 + rate);
			years++;
			System.out.printf("year = %7d fv = %10.2f\n", years, fv);
		}
		
		/*
		for(int i = 1; i <= nper; i++)
		{
			fv = fv * (1 + rate);
			System.out.printf("i = %d fv = %f\n", i, fv);
		}
		*/
		


	}

}
