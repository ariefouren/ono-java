import java.util.Scanner;

public class Communication2 {

	public static void main(String[] args) {
		// user input
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter antenna x coordinate (-100 ... 100): ");
		double xa = in.nextDouble();
		System.out.print("Enter antenna y coordinate (-100 ... 100): ");
		double ya = in.nextDouble();
		System.out.print("Enter antenna range radius(-100 ... 100): ");
		double r = in.nextDouble();
		System.out.print("Enter phone x coordinate (-100 ... 100): ");
		double xp = in.nextDouble();
		System.out.print("Enter phone y coordinate (-100 ... 100): ");
		double yp = in.nextDouble();
		
		// computation
		// d = sqrt( (xp - xa)^2  + (yp - ya)^2  )
		double d = Math.sqrt( Math.pow((xp - xa), 2)  + Math.pow((yp - ya), 2)  );
		
		String msg;
		if(d <= r)
		{
			msg = String.format("the phone at (%.1f, %.1f) is INSIDE the antenna range",
					xp, yp);
		}
		else
		{
			msg = String.format("the phone at (%.1f, %.1f) is OUTSIDE the antenna range",
					xp, yp);
		}
		
		// output
		StdDraw.setScale(-100, 100);
		// draw the antenna
		StdDraw.circle(xa, ya, r);
		StdDraw.setPenRadius(0.015);
		StdDraw.point(xa, ya);
		String str2 = String.format("(%.1f, %.1f)", xa, ya);
		StdDraw.textLeft(xa, ya, str2);
				
		// draw the phone
		StdDraw.point(xp, yp);
		String str3 = String.format("(%.1f, %.1f)", xp, yp);
		StdDraw.textLeft(xp, yp, str3);
		
		// show the message
		StdDraw.textLeft(-90, -90, msg);

	}

}
