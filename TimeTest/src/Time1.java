
public class Time1 {

	private int hour;
	private int minute;
	private int second;

	public Time1() {
		this(0, 0, 0);
	}

	public Time1(int hour) {
		this(hour, 0, 0);
	}

	public Time1(int hour, int minute) {
		this(hour, minute, 0);
	}

	public Time1(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}

	public Time1(Time1 t) {
		setTime(t.hour, t.minute, t.second);
	}

	public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
			throw new IllegalArgumentException("Time is out of range!");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public String toString() {
		return String.format("%d:%02d:%02d %s", (hour == 0 || hour == 12) ? 12 : hour % 12, minute, second,
				(hour < 12) ? "AM" : "PM");
	}

	public void setHour(int hour) {
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("Time is out of range!");
		this.hour = hour;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("Time is out of range!");
		this.minute = minute;
	}

	public void setSecond(int second) {
		if (second < 0 || second >= 60)
			throw new IllegalArgumentException("Time is out of range!");
		this.second = second;
	}

	public int getHour() {
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getSecond() {
		return this.second;
	}
}
