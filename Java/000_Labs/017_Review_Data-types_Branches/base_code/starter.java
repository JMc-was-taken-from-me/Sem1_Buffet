import java.util.Scanner;
import java.util.Random;
// that's right, i made the whole thing if-else statements boiiiii
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int pt = 20;

		System.out.println();
		System.out.println("what be thy name?");
			String name = sc.nextLine();

		System.out.println();
		System.out.println("What title doth thou go by (e.g. Gorlok the Destroyer)");
			String title = new String(sc.nextLine());

		System.out.println();
		System.out.println("which class wishst thou choose?(Rogue, Warrior, Wizard)");
			String pick  = new String(sc.nextLine());

			if ((pick.equals("warrior"))||(pick.equals("Warrior"))||(pick.equals("Wizard"))||(pick.equals("wizard"))||(pick.equals("rogue"))||(pick.equals("Rogue"))){
				System.out.println(pick+"? really?");
			}

			else {
				System.out.println("pick an actual class please");
			}

			System.out.println();
			System.out.println("Thou has in thy possession 20 points for thy skills (Strength, Dexterity, Intelligence, & Charisma), I beg thee, dont be a dumbass with the points and break my program");


			System.out.println();
			System.out.println("Allocate thy points for Str ["+pt+"]");

				int str = sc.nextInt();
				pt = pt - str;

			if (pt <= 0){
				System.out.println("thou hast run out of points, try again");
				System.exit(0);
			}
			else{ System.out.println();
			System.out.println("Allocate thy points for Dex ["+pt+"]");

				int dex = sc.nextInt();
				pt = pt - dex;
		
				if (pt <= 0){
					System.out.println("thou hast run out of points, try again");
					System.exit(0);
				}
				else{ System.out.println();
			System.out.println("Allocate thy points for Int["+pt+"]");

					int Int = sc.nextInt();
					pt = pt - Int;
				
					if (pt <= 0){
					System.out.println("thou hast run out of points, try again");
					System.exit(0);
				}
				
				else{ System.out.println();
			System.out.println("Allocate thy points for Chr["+pt+"]");

				int chr = sc.nextInt();
				pt = pt - chr;

				if (pt < 0){
					System.out.println("thou hast run out of points, try again");
					System.exit(0);
				}

				else{System.out.println("~~~~~~~~~~~~~~");
			System.out.println("Character Summary:");
			System.out.println("Hear ye, " +name+ ": " + title+ "!");
		        System.out.println("Thou art a " + pick);	
			System.out.println(", and thou possessth these skills as follows:");
			System.out.println("Strength: "+str);
			System.out.println("Dexterity: "+dex);
			System.out.println("Intelligence: "+Int);
			System.out.println("Charisma: "+chr);
			System.out.println("~~~~~~~~~~~~~~");

			}
			}
			}	
		}
	}
	}
