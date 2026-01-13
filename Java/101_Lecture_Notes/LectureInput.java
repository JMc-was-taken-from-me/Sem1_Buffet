import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {

	    Scanner sc = new Scanner(System.in);
	
	System.out.println("🍾Joshua's store of questionable legality!🍾");
	System.out.println("	peruse my wares:");
	System.out.println("🌱Devil's Lettuce: $9.99 per gram");
	System.out.println("👃🏻Mystery White Powder: $24.99 per gram");
	System.out.println("💉Interesting Sryinge: $14.99 per mL");	

	System.out.println("Insert the name of whom is to recieve my product");
	
		String customer = sc.nextLine();

	System.out.println("Input quantity of Devil's Lettuce in grams (as just a number)");
		double DLq = sc.nextDouble();

	System.out.println("Input quantity of Mystery White Powder in grams (as just a number)");
		double WPq = sc.nextDouble();

	System.out.println("Input quantity of Interesting Syringes in mL (as just a number)");
		int ISq = sc.nextInt();

	double DLprice = (9.99 * (DLq));
	double WPprice = (24.99 * (WPq));
	double ISprice = (14.99 * (ISq));

    System.out.println();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("your recipt of purchase");
    System.out.println((DLq) + " grams = $" + (DLprice));
    System.out.println((WPq) + " grams = $" +(WPprice));
    System.out.println((ISq) + " mL = $" + (ISprice));
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
//	System.out.print(DLprice);
        	}
}
