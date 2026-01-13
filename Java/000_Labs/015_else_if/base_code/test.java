import java.util.Scanner;

class test{
	public static void main(String arg []) {
		Scanner sc = new Scanner(System.in);
			
		double correct = 1;

		System.out.println("1");	
		double usr = sc.nextDouble();

			if(usr==correct) {
				System.out.println("you typed 1");
			}

			else{
//				System.out.println("type 1");
				return;
			}
	}
}
