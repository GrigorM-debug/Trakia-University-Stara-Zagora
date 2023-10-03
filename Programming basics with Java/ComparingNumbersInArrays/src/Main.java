import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] arr1 = {10,20,30,40,50,60};
        int [] arr2 = {10,20,30,40,50,60};
        int [] arr3 = {6,5,3,2,1};

        System.out.println(arrEqual(arr1, arr3));
    }

    static boolean arrEqual(int[] firstArray, int[] secondArray){
        return Arrays.equals(firstArray, secondArray);
    }
}

