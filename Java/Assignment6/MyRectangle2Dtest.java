import java.util.Scanner;
public class MyRectangle2Dtest {

	public static void main(String[] args) {
		System.out.println("This program takes in a base rectangle and a test rectangle. The program will print the area, perimeter and ");
		System.out.println("check if the test rectangle is contained or overlapping with the base rectangle.");
		System.out.println("It will also check to see if the center of the test rectangle is contained in the base rectangle.");
		Scanner in = new Scanner (System.in);
		boolean check = true;
	
		MyRectangle2D base = new MyRectangle2D();


		System.out.println("Please enter the center of the base rectangle. X-value first and then Y-value");
		System.out.println("Ex: 2 5 Equals (2,5)");
		double x = in.nextDouble();
		double y = in.nextDouble();
		
		while(check) {
			check = false;
			System.out.println("Enter the width of the rectangle followed by the base. No negative numbers.");
			System.out.println("Ex: 4 5 Equals Width = 4, Height = 5");
			double w = in.nextDouble();
			double h = in.nextDouble();

			try {
			base = new MyRectangle2D(x,y,w,h);
			}
			catch(Exception ex) {
				System.out.println(ex);
				check = true;
			}
			
		}
		int r = 1;
		MyRectangle2D test = new MyRectangle2D();
		while(r!=0) {
				System.out.println("Please enter the center of the test rectangle. X-value first and then Y-value");
				System.out.println("Ex: 2 5 Equals (2,5)");
				x = in.nextDouble();
				y = in.nextDouble();
				check = true;
				while(check) {
					check = false;
					System.out.println("Enter the width of the rectangle followed by the base. No negative numbers.");
					System.out.println("Ex: 4 5 Equals Width = 4, Height = 5");
					double w = in.nextDouble();
					double h = in.nextDouble();
	
					try {
					test = new MyRectangle2D(x,y,w,h);
					}
					catch(Exception ex) {
						System.out.println(ex);
						check = true;
					}
					
				}
				
				System.out.println("Perimeter: " + test.getPerimeter());
				System.out.println("Area: " + test.getArea());
				
				if(base.contains(x,y)) {
					System.out.println("The base rectangle contains the center of the test rectangle");
				}
				else {
					System.out.println("The base rectangle does NOT contain the center of the test rectangle");
				}
				if(base.contains(test)) {
					System.out.println("The base rectangle contains the test rectangle");
				}
				else {
					System.out.println("The base rectangle does NOT contain the test rectangle");
				}
				if(base.overlaps(test)) {
					System.out.println("The base rectangle overlaps the test rectangle");
				}
				else {
					System.out.println("The base rectangle does NOT overlap the test rectangle");
				}

			System.out.println("Enter 1 to repeat putting in test rectangles. Enter 0 to exit.");
			r=in.nextInt();
		}
		
		
	}

}
