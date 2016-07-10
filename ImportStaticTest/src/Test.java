import static java.lang.Math.*;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to find its sqrt: ");
		String number = input.nextLine().trim();
		input.close();
		System.out.println("The sqrt of the number " + number + " is " + sqrt(Double.parseDouble(number)));
	}
}
