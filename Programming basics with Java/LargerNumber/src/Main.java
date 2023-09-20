// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Въведете две числа: ");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        greaterNumber(a, b);
    }

    public static void greaterNumber(int a, int b){
        if(a > b){
            System.out.println("Числото " + a + " е по-голямо от числото " + b);
        }
        else {
            System.out.println("Числото " + a + " е по-малко от числото " + b);
        }
    }
}