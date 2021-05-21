public class Var {
	public static void main (String[]args){
		int x = 10;
		int y,z;
		y = 8;
		z = 98;
		System.out.println(x); //should output 10
		System.out.println(x++); //should output 11
		y = x++;
		System.out.println(x); //should output 11
		System.out.println(y); // should output 12 
		System.out.println(z); //should output 98
		 z = (z + x++);
		System.out.println(z); //should output 110
		System.out.println(x); // 13
		z = (z+ ++x);
		System.out.println(z); //124
		x = ++x;
		System.out.println(x); //15
	}
}