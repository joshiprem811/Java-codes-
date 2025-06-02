class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}

class Employee1 extends Person {
    private String employeeId;
    private String jobTitle;

    public Employee1(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}

public class Person1 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1("Roshan", "Ramani", "63", "Cyber Security Engineer");
        System.out.print(emp.getFirstName());
        System.out.print(" " + emp.getLastName());
        System.out.print(", " + emp.getEmployeeId());
    }
}