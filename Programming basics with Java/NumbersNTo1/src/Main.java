import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter number: ");

        int n = scanner.nextInt();

        for(int i = n; i>=0; i--){
            System.out.println(i);
        }
    }
}