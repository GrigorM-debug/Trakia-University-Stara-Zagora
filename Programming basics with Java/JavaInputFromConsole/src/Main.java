// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOne = Integer.parseInt(System.console().readLine());
        double numberTwo = Double.parseDouble(System.console().readLine());

        double sum = (double)numberOne + numberTwo;

        System.out.println("The sum of the numbers is: " + sum);
    }
}