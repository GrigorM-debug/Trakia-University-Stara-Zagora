public class Rectangle {
    private Point[] points = new Point[4];

    public Rectangle(Point leftTop, Point rightTop, Point leftBot, Point rightBot){
        points[0] = leftTop;
        points[1] = rightTop;
        points[2] = leftBot;
        points[3] = rightBot;
    }

    public double getArea(){
        double width = getWidth();
        double height = getHeight();
        return width * height;
    }

    public double getPerimeter(){
        double width = getWidth();
        double height = getHeight();
        return 2 * (width + height);
    }

    public double getWidth(){
        return calcDistance(points[0], points[1]);
    }

    public double getHeight(){
        return calcDistance(points[0], points[2]);
    }

    public double calcDistance(Point a, Point b){
        int x1 = a.getX();
        int y1 = a.getY();
        int x2 = b.getX();
        int y2 = b.getY();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
