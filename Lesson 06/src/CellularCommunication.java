import java.util.Scanner;

public class CellularCommunication {

	public static void main(String[] args) {
		// user input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter X position of the center of the building (-100 ... 100): ");
		double xb = in.nextDouble();
		System.out.print("Enter Y position of the center of the building (-100 ... 100): ");
		double yb = in.nextDouble();
		System.out.print("Enter half-width of the building (0 ... 100): ");
		double hw = in.nextDouble();
		System.out.print("Enter half-length of the building (0 ... 100): ");
		double hh = in.nextDouble();
		
		System.out.print("Enter X position of the phone (-100 ... 100): ");
		double xp = in.nextDouble();
		System.out.print("Enter Y position of the phone (-100 ... 100): ");
		double yp = in.nextDouble();
		
		// computation
		double xmin = xb - hw;
		double xmax = xb + hw;
		double ymin = yb - hh;
		double ymax = yb + hh;
		
		String msg;
		if( ! (xmax < xp   || 
				xp < xmin  ||
				ymax < yp  ||
				yp < ymin) /*PHONE IS NOT OUTSIDE THE BUILDING*/ )
		{
			msg = String.format("phone at (%.0f, %.0f) is INSIDE the building", 
					xp, yp);
		}
		else
		{
			msg = String.format("phone at (%.0f, %.0f) is OUTSIDE the building", 
					xp, yp);
		}
		
		
		
		// output
		
		System.out.print(msg);

	}

}
