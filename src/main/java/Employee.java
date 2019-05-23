abstract class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private double timeWorked;


    Employee(int id, String firstName, String lastName, double salary, double timeWorked) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.timeWorked = timeWorked;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    public void setTimeWorked(double timeWorked) {
        this.timeWorked = timeWorked;
    }

    public abstract double calculate();
}
