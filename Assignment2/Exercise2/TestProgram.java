public class TestProgram {
    public static void main(String[] args) {

        Person person = new Person("Zara Khan", "789 Willow Lane", "555-2345", "zara.khan@example.com");
        System.out.println(person.toString());

        Student student = new Student("Ethan Martinez", "456 Birch Avenue", "555-6789", "ethan.m@example.com",
                Student.SENIOR);
        System.out.println(student.toString());

        MyDate hireDate = new MyDate(2021, 7, 22);
        Employee employee = new Employee("Lily Chen", "321 Aspen Road", "555-0123", "lily.chen@example.com",
                "Office 404", 75000.0, hireDate) {
            // this is anonymous subclass
        };
        System.out.println(employee.toString());

        Faculty faculty = new Faculty("Raj Patel", "654 Pine Street", "555-4567", "raj.patel@example.com",
                "Office 505", 90000.0, new MyDate(2017, 9, 30), "10AM-4PM", "Associate Professor");
        System.out.println(faculty.toString());

        Staff staff = new Staff("Maya Singh", "987 Cedar Boulevard", "555-8901", "maya.singh@example.com",
                "Office 606", 55000.0, new MyDate(2019, 4, 18), "Coordinator");
        System.out.println(staff.toString());
    }
}
