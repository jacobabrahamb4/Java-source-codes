
public class Date {

	private int month;
	private int day;
	private int year;

	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public Date(int month, int day, int year) {
		if (month <= 0 || month > 12)
			throw new IllegalArgumentException("month must be 1-12");

		if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
			throw new IllegalAccessError("Day put of range!");

		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			throw new IllegalArgumentException("day out of range for the specified month and year");

		this.day = day;
		this.month = month;
		this.year = year;

		System.out.println("Date object created: " + this);
	}

	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}

}
