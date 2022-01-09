package utility;

import java.util.Objects;

public class Date {
    private int year;
    private int day;
    private String month;

    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return year == date.year &&
                day == date.day &&
                month.equals(date.month);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, day, month);
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", day=" + day +
                ", month='" + month + '\'' +
                '}';
    }
}
