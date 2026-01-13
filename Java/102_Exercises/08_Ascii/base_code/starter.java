
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);

		System.out.println("input what art u want");
		String usr = sc.nextLine();
		
		if (usr.equals("cuttlefish")){
			System.out.println(" \\  \\  |  /  /");
			System.out.println("  \\  \\ | / /");
			System.out.println("   [      ]   ");
			System.out.println("  ('|     |')");
			System.out.println("   (       ) \n     (     )");
			System.out.println("       -----");
		
		}

		else if (usr.equals("ice cream")){
			System.out.println("()>");	
		}

		else if (usr.equals("face")){
			System.out.println(":)");	
		
		}

		else {
			System.out.println("input either cuttlefish, ice cream, or face");	
		}
	}
}
