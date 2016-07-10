
public class Test {

	public static void main(String[] args) {
		Time1 time = new Time1();
		displayTime("Before calling setTime", time);
		time.setTime(13, 27, 6);
		displayTime("After calling setTime", time);

		try {
			time.setTime(99, 99, 99);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		displayTime("After setting time with invalid values", time);
	}

	private static void displayTime(String header, Time1 t) {

		System.out.printf("%s%n Universal time: %s%n Standard time: %s%n", header, t.toUniversalString(), t.toString());

	}

}
