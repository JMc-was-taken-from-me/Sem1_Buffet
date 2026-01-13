
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter an integer");
			int num1 = sc.nextInt();

		System.out.println("enter another integer");
			int num2 = sc.nextInt();

		boolean dif = num1!=num2;
		boolean same = num1==num2;

			if(dif){

				System.out.println("those are different");
		}
			if(same){
			
				System.out.println("those are same");
		}



	}
}
