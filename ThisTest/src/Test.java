
public class Test {

	public static void main(String[] args) {
		SimpleTime time = new SimpleTime(13, 27, 6);
		displayTime("Before calling setTime", time);
		time.setTIme(15, 17, 6);
		displayTime("After calling setTime", time);

		try {
			time.setTIme(99, 99, 99);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		displayTime("After setting time with invalid values", time);
	}

	private static void displayTime(String header, SimpleTime t) {

		System.out.printf("%s%n Universal time: %s%n Standard time: %s%n", header, t.toUniversalString(), t.toString());

	}

}

class SimpleTime {

	private int hour;
	private int minute;
	private int second;

	public SimpleTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setTIme(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
			throw new IllegalArgumentException("Time is out of range!");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}

	public String toString() {
		return String.format("%d:%02d:%02d %s", (hour == 0 || hour == 12) ? 12 : hour % 12, minute, second,
				(hour < 12) ? "AM" : "PM");
	}

}
