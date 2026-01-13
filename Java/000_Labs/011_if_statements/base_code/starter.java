import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x");

		int x = sc.nextInt();
		System.out.println("x is " + x);
		
		System.out.println("y");

		int y = sc.nextInt();
		System.out.println("y is "+ y);

		String faux = new String("x & y sont differentes");
		String vrai = new String("x & y sont la meme");

		boolean not = x!=y;
		boolean z = x==y;
		if(z) {
			System.out.print(vrai);
		}

		if(not){
			System.out.print(faux);
		}
	}
}
