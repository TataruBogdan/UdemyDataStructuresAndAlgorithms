package com.bogdantataru;

public class EmployeeNode {

    private Employee employee;

    private EmployeeNode next;//stores a reference to the next node in the list.

    // So, the constructor only takes employee because when we construct an instance, we don't know yet what the next node will be.
    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return employee.toString() ;
    }
}
