import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] arr1 = {10,20,30,40,50,60};
        int [] arr2 = {10,20,30,40,50,60};
        int [] arr3 = {6,5,3,2,1};

<<<<<<< HEAD
        System.out.println(arrEqual(arr1, arr2));
    }

    static boolean arrEqual(int[] firstArray, int[] secondArray){
        //return Arrays.equals(firstArray, secondArray);
        if(firstArray.length != secondArray.length){
            return false; //if array have different lengths they can't be equal
        }
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true;
=======
        System.out.println(arrEqual(arr1, arr3));
    }

    static boolean arrEqual(int[] firstArray, int[] secondArray){
        return Arrays.equals(firstArray, secondArray);
>>>>>>> 0b3bfcb765ec24bccabdcb7d97f170003407c1ef
    }
}

