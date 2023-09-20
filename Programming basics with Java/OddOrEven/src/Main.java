import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.print("Въведете число: ");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.print("Числото " + number + " е четно");
        }
        else{
                System.out.println("Числото " + number + " е не четно");
        }
    }
}