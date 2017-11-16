import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		System.out.println("This program takes in 3 sides of a triangle and prints out the sides, area and perimeter.");
		System.out.println("It also checks to see if the triangle is valid");
		Scanner in = new Scanner (System.in);
		int r = 1;
		double a,b,c;
		String s;
		boolean f;
		boolean check;
		while(r==1) {
			check = true;
			TriangleClass x = new TriangleClass();
			while(check){
				check = false;
				System.out.println("Please enter 3 sides followed by spaces.");
				System.out.println("Ex 3 4 5 equals. Side1 = 3, Side2 = 4, Side3 = 5.");
				
				a = in.nextDouble();
				b = in.nextDouble();
				c = in.nextDouble();
				System.out.println("Enter the color of the triangle");
				s = in.next();
				System.out.println("Is the triangle filled or empty?");
				System.out.println("Enter true for filled, enter false for empty");
				f = in.nextBoolean();
					try {
						x = new TriangleClass(a,b,c,s,f);
					}
					catch (Exception ex) {
						System.out.println(ex);
						check = true;
					}
			}
				System.out.println(x.toString());
				System.out.println(x.getArea());
				System.out.println(x.getPerimeter());
		}

	}

}
