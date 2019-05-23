import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class AccountantTest {

    @Test
    void paySalaryTest() {
        Employee programmerJohn = new Programmer(100, "John", "Cooper", 10, 0);
        Employee managerMichael = new Manager(101, "Michael", "Jackson", 15, 0, 160);
        Employee managerAdam = new Manager(102, "Adam", "Gordon", 12, 0, 100);

        // programmerJohn, managerAdam and managerMichael are working...

        programmerJohn.setTimeWorked(programmerJohn.getTimeWorked() + 100);
        managerMichael.setTimeWorked(managerMichael.getTimeWorked() + 140);
        managerAdam.setTimeWorked(managerMichael.getTimeWorked() + 120);

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(programmerJohn);
        employees.add(managerMichael);
        employees.add(managerAdam);

        HashMap<Integer, Double> payout = Accountant.paySalary(employees);

        HashMap<Integer, Double> expected = new HashMap<Integer, Double>();
        expected.put(100, 1000.0);
        expected.put(101, 2100.0);
        expected.put(102, 1200.0);

        assertEquals(expected, payout);
    }
}