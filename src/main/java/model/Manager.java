package model;

public class Manager extends Employee {

    public Manager() {
    }

    @Override
    public int calcSalary (int numberOfManagers) {
        return 13000*numberOfManagers;
    }

}
