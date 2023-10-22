import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if(a+b==c){
            if(a>b){
                System.out.printf("%d + %d = %d", b, a, c);
            }
            else{
                System.out.printf("%d + %d = %d", a, b, c);
            }
        }
        else if(a+c == b){
            if(a<c){
                System.out.printf("%d + %d = %d", a, c, b);
            }
            else{
                System.out.printf("%d + %d = %d", c, a, b);
            }
        }
        else if (b+c == a){
            if(b<c){
                System.out.printf("%d + %d = %d", b, c, a);
            }
            else{
                System.out.printf("%d + %d = %d", c, b, a);
            }
        }
        else {
            System.out.println("No");
        }
    }
}