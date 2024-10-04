public class TestMyPoint {
    public static void main(String[] args) {

        MyPoint point1 = new MyPoint(); // (0, 0)
        MyPoint point2 = new MyPoint(10, 30.5); // (10, 30.5)

        System.out.println("Point1 coordinates: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point2 coordinates: (" + point2.getX() + ", " + point2.getY() + ")");
        System.out.println();

        // Calculate and display distance using instance method
        double distance1 = point1.distance(point2);
        System.out.println("Distance between Point1 and Point2 (using MyPoint method): " + distance1);

        // Calculate and display distance using instance method with specified
        // coordinates
        double distance2 = point1.distance(10, 30.5);
        System.out.println("Distance between Point1 and (10, 30.5) (using coordinate method): " + distance2);

        // Calculate and display distance using static method
        double distance3 = MyPoint.distance(point1, point2);
        System.out.println("Distance between Point1 and Point2 (using static method): " + distance3);
    }
}
