import model.Agent;
import model.Manager;
import model.Worker;

import java.util.Arrays;

public class EmployeeMain {
    public static void main(String[] args) {

        Manager manager = new Manager();
        Agent agent = new Agent();
        Worker worker = new Worker();

        int ms = manager.calcSalary(1);
        int as = agent.calcSalary(120);
        int ws = worker.calcSalary(21);

        int staffArray[][] = new int[3][3];

        for (int i=0;i<3;i++) {
            staffArray[i][1]= manager.calcSalary(1);
            staffArray[i][2]= agent.calcSalary(120*i);
            staffArray[i][3]= worker.calcSalary(19+i);
        }

        System.out.println(Arrays.toString(staffArray));
    }
}
