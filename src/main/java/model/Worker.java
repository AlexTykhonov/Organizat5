package model;

public class Worker extends Employee {

    public Worker() {
    }

    int mandays;

    public Worker(int mandays) {
        this.mandays = mandays;

    }

    @Override
    public int calcSalary(int md) {
       return md * 100;
    }
}
