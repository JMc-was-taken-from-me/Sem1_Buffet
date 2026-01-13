import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
			int correct = (int)(Math.random() * 1000);

			// to test if the dang thing works
			//System.out.print(correct);

			System.out.println("guess a numba 'tween 0-1000");

			int guess = sc.nextInt();
			
				if(correct==guess){
					System.out.println("hurray");
				}

				else{
					System.out.println("WRONG");
				}	

		}
	}
