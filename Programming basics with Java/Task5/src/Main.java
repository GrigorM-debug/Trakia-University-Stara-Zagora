//Task 5. Create a Rectangle class using an array of its four vertices of type Point
public class Main {
    public static void main(String[] args) {
        Point leftTop = new Point(200, 100);
        Point rightTop = new Point(500, 100);
        Point leftBot = new Point(200, 300);
        Point rightBot = new Point(500, 300);

        Rectangle rectangle = new Rectangle(leftTop, rightTop, leftBot, rightBot);

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}