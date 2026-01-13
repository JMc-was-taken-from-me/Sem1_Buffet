
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
			
			System.out.println("what is your first name");
				String nom = sc.nextLine();
			
			System.out.println("Combien ans avez-vous?");
				String age = sc.nextLine();

			System.out.println("what is your birthday (M/D/Y)");
				String bday = sc.nextLine();

			System.out.println("Now, be honest. On a scale of 0-10 (0 = no money ; 10 = i could buy Blackrock and it wouldn't matter), how broke are you?");
				String money = sc.nextLine();

			System.out.println("i know everything now");

			System.out.print("your name is ");

				System.out.println(nom);

			System.out.print("your age: ");

				System.out.println(age);

			System.out.print("you were born ");

				System.out.println(bday);

			System.out.print("and yo money score is ");

				System.out.println(money);

	}
}
