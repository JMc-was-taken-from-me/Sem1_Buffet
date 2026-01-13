import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("type if you would like to be a rogue, wizard, or a warrior");
		
		String pick  = new String(sc.next());
			//System.out.println(pick);

			if ((pick.equals("warrior"))||(pick.equals("Warrior"))||(pick.equals("Wizard"))||(pick.equals("wizard"))||(pick.equals("rogue"))||(pick.equals("Rogue"))){
				System.out.println(pick+"? really?");
			}

			else {
				System.out.println("pick an actual class please");
			}
	}
}
