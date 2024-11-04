package MyDate;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    // No-arg constructor to create MyDate object for current date
    public MyDate() {
        GregorianCalendar currentDate = new GregorianCalendar();
        this.year = currentDate.get(GregorianCalendar.YEAR);
        this.month = currentDate.get(GregorianCalendar.MONTH);
        this.day = currentDate.get(GregorianCalendar.DAY_OF_MONTH);
    }

    // Constructor with specified elapsed time since 1/1/1970
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Constructor with specified year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter methods
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // Method to set date using elapsed time
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}