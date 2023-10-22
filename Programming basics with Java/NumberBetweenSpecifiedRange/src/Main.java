import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.print("Въведете число: ");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if(number < 100){
            System.out.println("Числото е под 100.");
        }
        else if(number >= 100 && number <= 200){
            System.out.println("Числото е между 100 и 200.");
        }
        else{
            System.out.println("Числото е над 200.");
        }
    }
}