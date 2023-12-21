/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	// a program that solves linear equations of the form a * x + b = c
	double a = Double.parseDouble(args[0]);
	double b = Double.parseDouble(args[1]);
	double c = Double.parseDouble(args[2]);
	double x = (c - b) / a ;
	System.out.println( a + " * x + "+ b + " = "+c);
	System.out.println( "x = " + x);
	//System.out.printf("%.1f * x + %.1f = %.1f\n", a, b, c);
   // System.out.printf("x = %.1f\n", x);
}