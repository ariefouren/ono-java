import java.util.Scanner;

public class PhoneAndAntenna {

	public static void main(String[] args) {
		// user input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter antenna x coordinate (-100 ... 100): ");
		double xa = in.nextDouble();
		
		System.out.print("Enter antenna y coordinate (-100 ... 100): ");
		double ya = in.nextDouble();
		
		System.out.print("Enter antenna range radius(0 ... 100): ");
		double r = in.nextDouble();
		
		System.out.print("Enter phone x coordinate (-100 ... 100): ");
		double xp = in.nextDouble();
				
		System.out.print("Enter phone y coordinate (-100 ... 100): ");
		double yp = in.nextDouble();
		
		// computation
		// d = sqrt((xa - xp)^2 + (ya - yp)^2 )
		double d = Math.sqrt(Math.pow((xa - xp), 2) + Math.pow((ya - yp),2) ); 
	
		String msg;
		if(d <= r)
		{
			// the phone is INSIDE the antenna range
			msg = "the phone is INSIDE the antenna range";
		}
		else
		{
			// the phone is OUTSIDE the antenna range
			msg = "the phone is OUTSIDE the antenna range";
		}
		
		// output
		System.out.print(msg);
	
	}

}