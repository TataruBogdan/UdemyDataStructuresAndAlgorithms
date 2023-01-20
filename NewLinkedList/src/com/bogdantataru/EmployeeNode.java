package com.bogdantataru;

// because I'm not going to use generics - the object can accept only Employee objects
public class EmployeeNode {

    // this is the employee field
    private Employee employee;

    // next field of type node -  because each node points to the node that comes after it.
    private EmployeeNode next;

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
        return employee.toString();
    }
}
