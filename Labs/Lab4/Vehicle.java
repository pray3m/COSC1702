import java.time.LocalDate;

public abstract class Vehicle {

    private String color;
    private LocalDate dateMade;

    public Vehicle() {
        this.color = "Unknown";
        this.dateMade = LocalDate.now();
    }

    public Vehicle(String color, LocalDate dateMade) {
        this.color = color;
        this.dateMade = dateMade;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getDateMade() {
        return dateMade;
    }

    public void setDateMade(LocalDate dateMade) {
        this.dateMade = dateMade;
    }

    public abstract void steer();
}
