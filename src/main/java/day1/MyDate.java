package day1;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printDay(){
        System.out.println("Day: " + this.day);
    }

    public void printMonth(){
        System.out.println("Month: " + this.month);
    }
    public void printYear(){
        System.out.println("Year: " + this.year);
    }

    public void PrintDate() {
        System.out.println("Date:" + this.year + "-" + this.month + "-" + this.day);
    }
}
