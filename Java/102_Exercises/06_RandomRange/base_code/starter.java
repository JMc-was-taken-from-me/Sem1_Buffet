
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("int 1");
		int num1 = sc.nextInt();

		System.out.println("int 2 (must be larger than int 1)");
		int num2 = sc.nextInt();

		boolean stupid = num1 >= num2;
		
		if(stupid){
		System.out.print("your int1 was larger or equal to your int2, stupid");
		}

		else{
		System.out.println("5 random numbers in the range: ");
		System.out.println((int) (Math.random() * (num2-(num1)) + num1));
		System.out.println((int) (Math.random() * (num2-(num1)) + num1));
		System.out.println((int) (Math.random() * (num2-(num1)) + num1));
		System.out.println((int) (Math.random() * (num2-(num1)) + num1));
		System.out.println((int) (Math.random() * (num2-(num1)) + num1));
		}

	}
}
