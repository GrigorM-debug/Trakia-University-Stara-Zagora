public class Cilinder extends Circle {
    private double height;

    public Cilinder() {
        super();
        this.height = 1.0;
    }

    public Cilinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cilinder [radius=" + super.getRadius() + ", height=" + height + ", volume=" + getVolume() + "]";
    }
}
