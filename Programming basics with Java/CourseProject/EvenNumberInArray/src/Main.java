// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 1,2,3,4,5,6};

        System.out.println("Even numbers in array: ");

        for(int i = 0; i < array.length- 1; i++){
            if(array[i] % 2==0){
                System.out.println(array[i]);
            }
        }
    }
}