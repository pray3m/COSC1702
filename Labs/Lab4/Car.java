import java.time.LocalDate;
import java.util.Objects;

public class Car extends Vehicle implements Drivable, Comparable<Car> {
    private String model;
    private int speed;

    public Car() {
        super();
        this.model = "Unknown";
        this.speed = 0;
    }

    public Car(String color, LocalDate dateMade, String model, int speed) {
        super(color, dateMade);
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Car))
            return false;
        Car other = (Car) obj;
        return Objects.equals(this.model, other.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }

    @Override
    public void steer() {
        System.out.println("Turn steering wheel.");
    }

    @Override
    public String howToDrive() {
        return "Step on gas pedal.";
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.speed, other.speed);
    }

    @Override
    public String toString() {
        return "Car [Model=" + model + ", Speed=" + speed + " km/h, Color=" + getColor() + ", Date Made="
                + getDateMade() + "]";
    }
}
