package com.samu.composite;

/**
 * Created by sandromuggli on 03.10.17.
 *
 * Entspricht Leaf
 */
class AtomicEmployee extends Employee {

    public AtomicEmployee(String name) {
        super(name);
    }

    @Override
    public void print(String space) {
        System.out.println(space + getName());
    }

    @Override
    public int getNumberOfEmployees() {
        return 1;
    };
}
