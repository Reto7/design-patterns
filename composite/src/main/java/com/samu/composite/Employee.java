package com.samu.composite;

/**
 * Created by sandromuggli on 03.10.17.
 *
 * Entspricht Component
 */
abstract class Employee {

    public abstract void print(String space);
    public abstract int getNumberOfEmployees();

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
