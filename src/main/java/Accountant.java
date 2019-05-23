import java.util.ArrayList;
import java.util.HashMap;

class Accountant {

    static HashMap<Integer, Double> paySalary(ArrayList<Employee> employees) {
        HashMap<Integer, Double> id_payout = new HashMap<Integer, Double>(employees.size());
        for (int i = 0; i < employees.size(); i++)
            id_payout.put(employees.get(i).getId(), employees.get(i).calculate());
        return id_payout;
    }
}
