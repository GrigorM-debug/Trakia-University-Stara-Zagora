// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }

        OptionalInt minNumber = Arrays.stream(numbers).min();
        OptionalInt maxNumber = Arrays.stream(numbers).max();

        int minNumberPosition= -1;
        int maxNumberPosition = -1;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == minNumber.getAsInt()){
                minNumberPosition = i;
            }
            else if(numbers[i] == maxNumber.getAsInt()){
                maxNumberPosition = i;
            }
        }

        System.out.printf("Before changing: ");
        for(int i = 0; i < numbers.length;i++) {
            System.out.printf(Integer.valueOf(numbers[i]) + " ");
        }

        System.out.println();

        int temp = numbers[minNumberPosition];
        numbers[minNumberPosition] = numbers[maxNumberPosition];
        numbers[maxNumberPosition] = temp;

        System.out.printf("After changing: ");
        for (int j = 0; j< numbers.length; j++){
            System.out.printf(Integer.valueOf(numbers[j]) + " ");
        }
    }
}