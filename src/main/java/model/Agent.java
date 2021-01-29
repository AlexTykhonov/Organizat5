package model;

import static java.lang.StrictMath.round;

public class Agent extends Employee {

    int sales;

    public Agent() {
    }

    public Agent(int sales) {
        this.sales = sales;
    }

    public int calcSalary(int salesvol) {
        return (int) (5000 + (salesvol * 0.05));

    }

}

