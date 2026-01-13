
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("#");
		int usr= sc.nextInt(); 
		int i= 0;		
		int ii= 0;
		while (ii < usr){
			while (i<ii){
			System.out.print("*");
			i++;	
			}
			ii++;
			System.out.println();
			i = 0;
		}
	
		}
	}
	

