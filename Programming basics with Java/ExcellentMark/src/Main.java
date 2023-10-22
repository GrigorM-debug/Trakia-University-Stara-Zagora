import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //double mark = 5.50;

        System.out.print("Въведете оценка: ");

        Scanner scanner = new Scanner(System.in);

        double mark = Double.parseDouble(scanner.nextLine());

        ExcellentScore(mark);
    }
    public static void ExcellentScore(double mark){
        if (mark < 3){
            System.out.println("Слаб: " + mark);
        }
        else if (mark >= 3 && mark <= 3.50){
            System.out.println("Среден: " + mark);
        }
        else if (mark >= 3.50 && mark <= 4.50){
            System.out.println("Добър: " + mark);
        }
        else if (mark >= 5 && mark <= 5.50){
            System.out.println("Много добър: " + mark);
        }
        else {
            System.out.println("Отличен: " + mark);
        }
    }
}