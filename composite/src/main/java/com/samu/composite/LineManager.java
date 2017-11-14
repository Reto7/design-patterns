package com.samu.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sandromuggli on 03.10.17.
 *
 * Entspricht Composite
 */
class LineManager extends Employee {

    private List<Employee> employees = new ArrayList();
    private String department;

    public LineManager(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public void add(Employee employee) {
        employees.add(employee);
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }

    public Employee getEmployee(int index) {
        return employees.get(index);
    }

    // rekursiv
    public void print(String space) {
        System.out.println(space + "Linemanager " + getName() + " (" + getDepartment() + ")");
        for (Employee employee : employees) {
            employee.print(space + "     ");
        }
    }

    // rekursiv
    public int getNumberOfEmployees() {
        int sum = 1; // himself
        for (Employee employee : employees) {
            sum += employee.getNumberOfEmployees();
        }
        return sum;
    };
}
