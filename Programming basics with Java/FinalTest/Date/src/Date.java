import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date implements Comparable<Date>{
    private int day;
    private String month;
    private int year;

    public Date(int day, String month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public int getDay(){
        return this.day;
    }

    public void setDay(int day){
        if(day <= 1 || day > 31){
            throw new IllegalArgumentException("Day is not valid.");
        }

        this.day = day;
    }

    public String getMonth(){
        return this.month;
    }

    public void setMonth(String month){
        if(month == null){
            throw new NullPointerException("Month is not valid.");
        }

        this.month = month;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        if(year <= 0){
            throw new IllegalArgumentException("Year is not valid");
        }

        this.year = year;
    }

    @Override
    public int compareTo(Date otherDate){
        if(otherDate == null){
            throw new NullPointerException("Date is not valid");
        }

        int monthToInt = getMonthAsNumber(this.month);
        int otherMonthToInt = getMonthAsNumber(otherDate.month);

        if(this.year != otherDate.year){
            return Integer.compare(this.year, otherDate.year);
        }
        if(!this.month.equals(otherDate.month)){
            return Integer.compare(monthToInt, otherMonthToInt);
        }

        return Integer.compare(this.day, otherDate.day);
    }

    public int numberOfDaysBetweenTwoDate(Date otherDate) throws ParseException {
        if(otherDate == null){
            throw new NullPointerException("Date is not valid");
        }

        int monthToInt = getMonthAsNumber(month);
        int otherMonthToInt = getMonthAsNumber(otherDate.month);

        String thisDateToString = String.format("%02d/%02d/%04d", this.day, monthToInt, this.year);
        String otherDateToString = String.format("%02d/%02d/%04d", otherDate.day, otherMonthToInt, otherDate.year);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        long date1Millis = sdf.parse(thisDateToString).getTime();
        long date2Millis = sdf.parse(otherDateToString).getTime();
        long diffInMilliseconds = Math.abs(date2Millis - date1Millis);
        long diffInDays = diffInMilliseconds / (24 * 60 * 60 * 1000);
        return (int) diffInDays;
    }

    public int numberOfDaysInMonth(String month, int year){
        if(month.equals("January") || month.equals("March") || month.equals("May")
        || month.equals("July") || month.equals("August") || month.equals("October") || month.equals("December")){
            return 31;
        }
        else if(month.equals("April") || month.equals("June") || month.equals("September")
        || month.equals("November")){
            return 30;
        }
        else if(month.equals("February") && isYearLeap(year)){
            return 29;
        }

        return 28;
    }

    public int numberOfDaysInYear(int year){
        return this.isYearLeap(year) ? 366 : 365;
    }

    public boolean isYearLeap(int year){
        return ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0));
    }

    public int getMonthAsNumber(String month) {
        switch (month.toLowerCase()) {
            case "january":
                return 1;
            case "february":
                return 2;
            case "march":
                return 3;
            case "april":
                return 4;
            case "may":
                return 5;
            case "june":
                return 6;
            case "july":
                return 7;
            case "august":
                return 8;
            case "september":
                return 9;
            case "october":
                return 10;
            case "november":
                return 11;
            case "december":
                return 12;
        }
        return -1;
    }
}
