import java.util.Scanner;
public class TestLinear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int repeat = 1;
		while(repeat==1) {
			double a,b,c,d,e,f;
			System.out.println("This program tests the Linear Class to solve two equations.");
			System.out.println("ax + by = e");
			System.out.println("cx + dy = f");
			System.out.println("If the equation is solvable, the program will prdouble out x and y values.");
			System.out.println("Please enter 3 numbers followed by a space for the first equation");
			System.out.println("Ex: 3 -1 7 equals 3x - y = 7");
			a = in.nextDouble();
			b = in.nextDouble();
			e = in.nextDouble();
			
			System.out.println("Please enter 3 numbers followed by a space for the second equation");
			System.out.println("Ex: 3 -1 7 equals 3x - y = 7");
			c = in.nextDouble();
			d = in.nextDouble();
			f = in.nextDouble();
			LinearClass eq = new LinearClass(a,b,c,d,e,f);
			
			if(eq.isSolvable()) {
				double x = eq.getX();
				double y = eq.getY();
				System.out.println("X = " + x);
				System.out.println("Y = " + y);
			}
			else {
				System.out.println("This equation is not solvable.");
			}
			double x1,x2,x3,x4,y1,y2,y3,y4;
			System.out.println("This part of the program takes in two lines and finds the intersection if any.");
			System.out.println("The lines are taken in by entering two pairs of coordinate points for that line.");
			System.out.println("Enter two coordinate points separated by numbers for the FIRST line.");
			System.out.println("Ex: 1 2 3 4 equals (1,2) and (3,4)");
			x1 = in.nextDouble();
			y1 = in.nextDouble();
			x2 = in.nextDouble();
			y2 = in.nextDouble();
			System.out.println("Enter two coordinate points separated by numbers for the SECOND line.");
			System.out.println("Ex: 1 2 3 4 equals (1,2) and (3,4)");
			x3 = in.nextDouble();
			y3 = in.nextDouble();
			x4 = in.nextDouble();
			y4 = in.nextDouble();
			
			a = y1 - y2;
			b = -(x1 - x2);
			e = ((y1 - y2)*x1) - ((x1 - x2)*y1);
			c = (y3 - y4);
			d = -(x3 - x4);
			f = ((y3 - y4) *x3) - ((x3 - x4)*y3);
			System.out.println(a);
			System.out.println(b);
			System.out.println(e);
			System.out.println(c);
			System.out.println(d);
			System.out.println(f);
			LinearClass w = new LinearClass(a,b,c,d,e,f);
			
			if(w.isSolvable()) {
				double ans = eq.getX();
				double ans1 = eq.getY();
				System.out.print("The intersecting point is");
				System.out.println("(" + ans + "," + ans1 + ")");
				
			}
			else {
				System.out.println("The lines are parallel.");
			}
			
			
			
			
			System.out.println("Enter 1 to repeat program. Enter 0 to quit");
			repeat = in.nextInt();
		}
	}

}
