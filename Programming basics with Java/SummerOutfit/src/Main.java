import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String outfit = "";
        String shoes = "";

        int degrees = Integer.parseInt(scanner.nextLine());

        //Scanner scanner2 = new Scanner(System.in);

        String timeOfTheDay = scanner.nextLine();

        if(10 <= degrees && degrees <= 18){
            switch (timeOfTheDay){
                case "Morning":
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    break;
                case "Afternoon":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        }
        else if(18 < degrees && degrees <= 24){
            switch (timeOfTheDay){
                case"Morning":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        }
        else if(degrees >= 25){
            switch (timeOfTheDay){
                case"Morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case"Afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;
                case"Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        }

        //System.out.println("It's " + degrees + " degrees, get your " + outfit + " and " + shoes);
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}