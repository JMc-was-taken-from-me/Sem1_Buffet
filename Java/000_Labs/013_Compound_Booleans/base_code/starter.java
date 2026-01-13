import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("put an integer");
			int num1 = sc.nextInt();

		System.out.println("put another integer");
			int num2 = sc.nextInt();

		System.out.println("put another another integer");
			int num3 = sc.nextInt();

//	finds largest num
			if((num2>num1)&&(num2>num3)){
		
				System.out.println("biggest num is " + num2);
		}
		
			if((num3>num1) && (num3>num2)){
				
				System.out.println("biggest num is " + num3);
		}	
			if((num1>num2)&&(num1>num3)){

				System.out.println("bigest num is " + num1);
		}
//	finds smallest num
			
			if((num1<num2)&&(num1<num3)){

				System.out.println("lowest num is " + num1);
		}	
			if((num2<num1)&&(num2<num3)){

				System.out.println("lowest num is " + num2);
		}
			if((num3<num1)&&(num3<num2)){

				System.out.println("lowest num is " + num3);
		}
	}
}
