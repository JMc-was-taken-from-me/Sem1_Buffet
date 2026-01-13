import java.util.Random;
import java.util.Scanner;

class starter { 
	
	public static void main(String args[]) {
		int rng1;
		int rng2;
		int rng3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how much money do you want to allocate to gambling today?");
		int argent = sc.nextInt();
		
		while (true){
			if (argent <= 0){
				System.out.println("please. play with a real amount of money");
				argent = sc.nextInt();
				System.out.println();
			}

			else {
			
				System.out.println("\nGreat, now we may begin");
				break;
			}
		}
		while(argent > 0){
		System.out.println("gambling gambling gambling gambling (insert your bet) [you have: $"+argent+" ]");
		
		int usr = sc.nextInt();
		while(true){
		if (Argbad_Check(usr,argent) == true) {
			System.out.println("casino think this monee value is bad, fix!");
			System.out.println("reminder you have: $"+argent);
			usr = sc.nextInt();
			}
		else {
			System.out.println("\n\nNow we have our bet!");
			break;
		}
		}
		rng1 =(int) (Math.random()*10);
		rng2 =(int) (Math.random()*10);
		rng3 = (int) (Math.random()*10);
		argent = argent - usr;
		
		System.out.println("| "+rng1+" | "+rng2+" | "+rng3+" |");
		
		if (Slots_Match(rng1,rng2, rng3) == 1){
		
			System.out.println("\ntoo bad, you won nothing");
			System.out.println();
		}

		else if(Slots_Match(rng1,rng2,rng3) == 2) {
		


			if (usr > 0){
				argent = usr * 2;
			}
			else {
			}
			System.out.println();
			System.out.println("\nbet monee doubled");
		}

		else {
		
			System.out.println("\nJACKPOT");
			argent = usr * 100;
			System.out.println();
		}
	}
	if (argent <= 0){
	
		System.out.println("you're flat broke at: $ "+argent+"!");
	}
	}
	public static boolean Argbad_Check(int usr, int argent){
		Scanner sc = new Scanner(System.in);
		if ((usr < 0) || (usr > argent)){
			return true;
		}
		else {
			return false;
		}
		}
	public static int Slots_Match(int rng1, int rng2, int rng3){
	
		if ((rng1 == rng2) || (rng1 == rng3) || (rng2 == rng3)){
		return 2;
		}

		else if ((rng1 == rng2) && (rng2 == rng3)){
		
			return 3;
		}

		else {
		
			return 1;
		}
	}
}
