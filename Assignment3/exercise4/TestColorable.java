package Assignment3.exercise4;

public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Square(2);
        objects[1] = new Square(3);
        objects[2] = new Square(4);
        objects[3] = new Square(5);
        objects[4] = new Square(6);

        for (GeometricObject obj : objects) {
            System.out.println(obj);
            System.out.println("Area: " + obj.getArea());

            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
            System.out.println();
        }
    }
}