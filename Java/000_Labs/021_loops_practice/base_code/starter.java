import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int goal = (int)(Math.random()*1000);
		//	System.out.println(goal); 
		//	to check if it work	

		System.out.print("what be thy guess?: ");
			int u_guess = sc.nextInt();

		if (u_guess == goal){
		
			System.out.println("you win");
		}
		
		else if(true) { {while (u_guess != goal) {
			if (u_guess < goal){
				System.out.println("that guess was too low, enter another gues");
				u_guess = sc.nextInt();
			}

			if (u_guess > goal){
				System.out.println("that guess was too high, enter another guess");
				u_guess = sc.nextInt();
			}
			else {
				break;
			}
		}
			System.out.println("correct, you win");
			
		}
		}

	}
}
