import java.util.Scanner;
import java.util.Arrays;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        int[] numbers = Arrays.stream(inputLine.split(" "))
                .filter(s -> !s.isEmpty()) // Remove the empty entries
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] numbersSorted = Arrays.stream(numbers).sorted().toArray();

        for(int i =0; i < numbersSorted.length; i++){
            System.out.printf(String.valueOf(numbersSorted[i]) + " ");
        }
    }
}