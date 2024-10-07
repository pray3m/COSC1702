public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        java.util.Date date = new java.util.Date();
        year = date.getYear() + 1900;
        month = date.getMonth() + 1;
        day = date.getDate();
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
