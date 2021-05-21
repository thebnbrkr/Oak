import java.util.Scanner;

public class push {
	public static void main (String[]Args) {
	System.out.print("Enter a number");
	Scanner in = new Scanner (System.in);
	double num = in.nextDouble();
	System.out.printf("The number that you've entered is %f", num);
	in.nextLine();
	String name = in.nextLine();
	System.out.printf("Name: %s", name);
	}
}
