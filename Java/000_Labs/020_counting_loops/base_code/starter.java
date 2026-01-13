import java.util.Scanner;

class starter {
	
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);


		System.out.print("what name do you want to be looped?: ");
		String name = new String(sc.nextLine());
		System.out.println();

		System.out.print("how many times do you want it to be looped? ");
		int u = sc.nextInt();
		System.out.println();

		for (int i = 0;i < u; i++) {
			if (u < 0) {
System.out.println("impossible to print negative number of times!");
				System.exit(1);
			}
			
			else {System.out.println(name);
			}
		}  
	}
}
