class Manager extends Employee {

    private double fullTime;

    Manager(int id, String firstName, String lastName, double salary, double timeWorked, double fullTime) {
        super(id, firstName, lastName, salary, timeWorked);
        this.fullTime = fullTime;
    }

    public double calculate() {
        double percentage = (getTimeWorked() > fullTime) ? 1 : getTimeWorked()/fullTime;
        return getSalary() * fullTime * percentage;
    }
}
