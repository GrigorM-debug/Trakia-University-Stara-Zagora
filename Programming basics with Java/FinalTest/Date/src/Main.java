import java.text.ParseException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ParseException {
        Date date1 = new Date(5, "May", 2023);
        Date date2 = new Date(15, "June", 2023);

        try {
            int comparisonResult = date1.compareTo(date2);
            if (comparisonResult < 0) {
                System.out.println("Date 1 is earlier than Date 2.");
            } else if (comparisonResult > 0) {
                System.out.println("Date 2 is earlier than Date 1.");
            } else {
                System.out.println("Date 1 and Date 2 are equal.");
            }

            System.out.println("Difference in days between the dates: " + date1.numberOfDaysBetweenTwoDate(date2));
            System.out.println("Number of days in month in first Date: " + date1.numberOfDaysInMonth(date1.getMonth(), date1.getYear()));
            System.out.println("Number of days in year in first Date: " + date1.numberOfDaysInYear(date1.getYear()));
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ParseException e){
            System.out.println("Error parsing dates: " + e.getMessage());
        }
    }
}