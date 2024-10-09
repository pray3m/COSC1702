
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestProgram {
    public static void main(String[] args) {

        Car car1 = new Car("Red", LocalDate.of(2020, 5, 15), "Toyota Camry", 180);
        Car car2 = new Car("Blue", LocalDate.of(2021, 6, 20), "Honda Accord", 200);
        Car car3 = new Car("Red", LocalDate.of(2020, 5, 15), "Toyota Camry", 180);
        Car car4 = new Car("Black", LocalDate.of(2022, 7, 25), "Ford Mustang", 250);

        System.out.println("Testing equals method:");
        System.out.println("car1.equals(car2): " + car1.equals(car2));
        System.out.println("car1.equals(car3): " + car1.equals(car3));
        System.out.println();

        System.out.println("Testing steer method:");
        car1.steer();
        car2.steer();
        System.out.println();

        System.out.println("Testing howToDrive method:");
        System.out.println("car1: " + car1.howToDrive());
        System.out.println("car2: " + car2.howToDrive());
        System.out.println();

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);

        System.out.println("Cars before sorting:");
        for (Car car : carList) {
            System.out.println(car);
        }
        System.out.println();

        Collections.sort(carList);

        System.out.println("Cars after sorting by speed:");
        for (Car car : carList) {
            System.out.println(car);
        }
        System.out.println();

        System.out.println("Additional Tests:");
        System.out.println("car1 color: " + car1.getColor());
        System.out.println("car4 date made: " + car4.getDateMade());
        car4.setSpeed(260);
        System.out.println("car4 new speed: " + car4.getSpeed());
    }
}
