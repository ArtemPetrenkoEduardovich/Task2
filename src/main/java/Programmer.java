class Programmer extends Employee {

    Programmer(int id, String firstName, String lastName, double salary, double timeWorked) {
        super(id, firstName, lastName, salary, timeWorked);
    }

    public double calculate() {
        return getSalary() * getTimeWorked();
    }
}
