public class Student extends Person {

    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;

    private int status;

    public Student(String name, String address, String phoneNumber, String emailAddress, int status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String statusString;
        switch (status) {
            case FRESHMAN:
                statusString = "Freshman";
                break;
            case SOPHOMORE:
                statusString = "Sophomore";
                break;
            case JUNIOR:
                statusString = "Junior";
                break;
            case SENIOR:
                statusString = "Senior";
                break;
            default:
                statusString = "Unknown";
        }
        return "Student: " + getName() + ", Status: " + statusString;
    }
}
