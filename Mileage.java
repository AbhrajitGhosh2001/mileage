//imports scanner
import java.util.Scanner;

public class Mileage
{
	public static void main(String[] args)
	{
		//Uses scanner
		Scanner keyboard = new Scanner(System.in);
		// Add your declaration and code here.
		double miles;
		double gallons;
		double mileage;
		//prints the purpose of it
		System.out.println("This program will calculate mileage");
		//prompts question
		System.out.println("How many miles have you driven?");
		//reads answer
		miles = keyboard.nextDouble();
		//prompts question
		System.out.println("How many gallons have you used?");
		//reads answer
		gallons = keyboard.nextDouble();
		// calculates mileage
		mileage = miles / gallons;
		//prints answer
		System.out.println(mileage+" miles per gallon");		
		//closes scanner
		keyboard.close();
	}
}
