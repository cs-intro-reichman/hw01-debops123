/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		//  gets a number of cents as a commandline argument and prints how to represent this quantity using as many quarters as possible plus
// the remainder in cents
		int num_of_cents = Integer.parseInt(args[0]);
		System.out.println("Use " + num_of_cents/25 + " quarters and " + num_of_cents%25 + " cents");
	}
}