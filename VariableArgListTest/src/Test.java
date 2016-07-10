import java.util.Scanner;

public class Test {

	public static double getAverage(final double... numbers) {
		double average = 0.0;
		for (double number : numbers) {
			average += number;
		}
		return (average /= numbers.length);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers separated by space: ");

		String[] userInput = input.nextLine().trim().split(" ");
		input.close();

		double[] numbers = new double[userInput.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (double) Double.parseDouble(userInput[i]);
		}

		System.out.println("The average of above numbers is : " + getAverage(numbers));
	}

}
