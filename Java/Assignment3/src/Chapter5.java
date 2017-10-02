import java.util.Scanner;
public class Chapter5 {

	public static void main(String[] args) {
			int a = 1;
			while(a==1) {
			System.out.println("This Program lists smallest factors of a number that you input.");
			System.out.println("Enter any real number");
			Scanner in = new Scanner(System.in);
			double x = in.nextDouble();
			factors(x);
			
			System.out.println("This program will print out all primes between 2 to 1000.");
			System.out.println("It will display 8 numbers per line followed seperated by one space.");
			int count = 0;
			final int line = 8;
			for(int i = 2;i<=100;i++) {
				if(Prime(i)) {
					count++;
					if(count%line==0) System.out.printf("%-1s\n", i);
					else System.out.printf("%-1s\n", i);

				}
				
					/*if(i%n==0) {
						count++;
						if(count%l==0) System.out.printf("%-1s\n", i);
						else System.out.printf("%-1s\n", i);
					
					} */
				
			}
			
			
			
			System.out.println("Enter 1 to repeat program. Enter 0 to exit.");
			a = in.nextInt();
		}
			
	}
	
	private static boolean Prime(int x) {
		for(int i = 2; i<=x;i++) {
			if(x%i==0) return false;
		}
		return true;
	}
	
	
	
	
	
	private static void factors(double x) {
		for(int i = 2; i<=x; i++) {
			while(x%i==0) {
				System.out.print(i + " ");
				x/=i;
			}
		}
		System.out.println("");
	}

}
