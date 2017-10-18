import java.util.Scanner;
public class TestRectangle {

	public static void main(String[] args) {
		int repeat = 1;

			
		
			System.out.println("This Program uses class RectangleClass and asks the user for various parameters of a rectangle");
			System.out.println("It uses exception handling to see if the parameters are valid. If valid the Width, Height, Area, and Perimeter is displayed");
			Scanner in = new Scanner(System.in);
			
			while(repeat!=0) {
			System.out.println("Please enter a double for the width Ex: 3.5");
			double w = in.nextDouble();
			System.out.println("Please enter a double for the height Ex: 55.2");
			double h = in.nextDouble();
			RectangleClass r = new RectangleClass();
			try {
				r.setWidth(w);
				r.setHeight(h);
			}
			catch (Exception ex) {
			System.out.println(ex);
		}
			r.print();
			
			System.out.println("Enter 1 to repeat program. Enter 0 to quit");
			repeat = in.nextInt();

		}		
	}

}
