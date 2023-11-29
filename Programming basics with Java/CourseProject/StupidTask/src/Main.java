// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String name = "Hat";
        double price = 100.20;
        double deliveryPrice = 20;

        Order order = new Order(name, price, deliveryPrice);

        System.out.println("Order name: " + order.GetName());
        System.out.printf("Order price:  %.2f", order.GetPrice());
        System.out.println();
        System.out.printf("Order delivery price: %.2f", order.GetDeliveryPrice());
    }
}