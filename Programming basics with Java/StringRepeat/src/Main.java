// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String str = "ho";
        int n = 3;

        System.out.println(repeat(str, n));
    }

    public static String repeat(String str, int n){
        /*String newString = str.repeat(n);
        return newString;*/

        StringBuilder newString = new StringBuilder();

        for(int i =0; i < n; i++){
            newString.append(str);
        }
        return newString.toString();
    }
}