public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint other) {
        double deltaX = this.x - other.x;
        double deltaY = this.y - other.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double distance(double x, double y) {
        double deltaX = this.x - x;
        double deltaY = this.y - y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        double deltaX = p1.x - p2.x;
        double deltaY = p1.y - p2.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
