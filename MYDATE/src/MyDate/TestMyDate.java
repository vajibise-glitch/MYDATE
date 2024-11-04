package MyDate;

public class TestMyDate {
    public static void main(String[] args) {
        // Create a MyDate object for the current date
        MyDate date1 = new MyDate();
        System.out.println("Date 1: " + date1.getYear() + "-" + (date1.getMonth() + 1) + "-" + date1.getDay());

        // Create a MyDate object with a specified elapsed time
        MyDate date2 = new MyDate(34355555133101L);
        System.out.println("Date 2: " + date2.getYear() + "-" + (date2.getMonth() + 1) + "-" + date2.getDay());
    }
}