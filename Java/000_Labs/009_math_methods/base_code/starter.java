
import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc  = new Scanner(System.in);

	System.out.println("input x");
		double x = sc.nextDouble();
	System.out.println("input y");
		double y = sc.nextDouble();

	System.out.println();
	System.out.println("~~~~~~~~~~~");
	System.out.println();
	System.out.print("the higher of the two is: ");
	System.out.println(Math.max(x,y));
	System.out.print("the square root of your y is ");
	System.out.println(Math.sqrt(y));
	System.out.print("your x to the power of your y is ");
	System.out.println(Math.pow(x,y));
	System.out.println();
	System.out.println("~~~~~~~~~~~");
	System.out.println();
	}
}
