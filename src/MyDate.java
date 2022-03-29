
public class MyDate {

	int day;
	int year;
	int month;

	public MyDate() {
		super();
	}

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.year = year;
		this.month = month;
	}

	@Override
	public String toString() {
		return month + "/" + day + "/" + year;
	}

	public void setDate(int m, int d, int y) {
		this.day = d;
		this.year = y;
		this.month = m;
	}

}
