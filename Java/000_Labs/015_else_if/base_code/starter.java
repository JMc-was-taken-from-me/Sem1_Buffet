import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int right = (int)(Math.random() *1000);
// make sure it do the do
System.out.println(right);
		System.out.println("guess between 1-1000");


		int guess = sc.nextInt();

			if(right==guess){
				System.out.println("hurray");
			}

			else if(guess>right){
				System.out.println("your guess was too high");
			}

			else if (guess<right){
				System.out.println("your guess was too low");
			}
	}	
}
