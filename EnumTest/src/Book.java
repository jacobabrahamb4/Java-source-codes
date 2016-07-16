
public enum Book {

	JHTP("Java How To Program", "2015"), CHTP("C How to Program", "2013");

	private final String title;
	private final String copyWriteYear;

	Book(String title, String copyWriteYEar) {
		this.title = title;
		this.copyWriteYear = copyWriteYEar;
	}

	public String getTitle() {
		return title;
	}

	public String getYear() {
		return copyWriteYear;
	}

	public String toString() {
		return String.format("Book: %s %s%n", title, copyWriteYear);
	}

}
