import java.util.Scanner;

public class circle {
	public static void main (String[]Args) {
		final double PI = 3.14159;
		System.out.println("-------------------------Circle area calculator-------------------------");
		Scanner in = new Scanner (System.in);
		in.nextLine();
		System.out.print("Enter the radius: ");
		double radius = in.nextDouble();
		double area = PI*radius*radius;
		in.nextLine();
		System.out.printf(" The area of the circle is %f", area);
		in.nextLine();
		double peri = PI*radius*2;
		System.out.printf(" The area of the perimeter is %f", peri);
	}
}