import java.util.Scanner;

public class Communication2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter antenna x coordinate (-100 ... 100): ");
		double xA = in.nextDouble();
		System.out.print("Enter antenna y coordinate (-100 ... 100): ");
		double yA = in.nextDouble();
		System.out.print("Enter antenna range radius(-100 ... 100): ");
		double r = in.nextDouble();
		System.out.print("Enter phone x coordinate (-100 ... 100): ");
		double xP = in.nextDouble();
		System.out.print("Enter phone y coordinate (-100 ... 100): ");
		double yP = in.nextDouble();
		
		// computation
		// d = sqrt((xp - xa)^2 + (yp - ya)^2)
		double d = Math.sqrt(Math.pow((xP - xA), 2) + Math.pow((yP - yA), 2));

		String msg;
		if(d <= r)
		{
			msg = "the phone is INSIDE the antena range";
		}
		else
		{
			msg = "the phone is OUTSIDE the antena range";
		}
		
		// output
		System.out.print(msg);
	}

}
