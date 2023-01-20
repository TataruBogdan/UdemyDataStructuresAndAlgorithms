package com.bogdantataru;

/*
  we have two references that we have to manage - next and previous
  Insert at head
1. Create a new node "Bill"
2. Assign "Jane" to Bill's next field
3. Assign whatever Jane is pointing to as previous to Bill's previous field
4. Assign "Bill" to Jane's previous field
5. Assign head to "Bill"
6. O(1) - time complexity
 */

// because I'm not going to use generics - the object can accept only Employee objects
public class EmployeeNode {

    // this is the employee field
    private Employee employee;

    // next field of type node -  because each node points to the node that comes after it.
    private EmployeeNode next;

    private EmployeeNode previous;

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

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
