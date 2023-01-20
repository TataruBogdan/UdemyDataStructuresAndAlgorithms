package academy.learnprogramming.challenge1;

import java.util.Iterator;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        EmployeeNode current = head;
        EmployeeNode newEmployeeNode = new EmployeeNode(newEmployee);

        // return true if you were able to successfully add the employee
        // into the list before the existing employee. Return false
        // if the existing employee doesn't exist in the list

        if (head == null) {
            return false;
        }

        while (current != null && !current.getEmployee().equals(existingEmployee)) {
            current = current.getNext();
        }

        if (current == null){
            return false;
        }
        newEmployeeNode.setPrevious(current.getPrevious());
        newEmployeeNode.setNext(current);
        current.setPrevious(newEmployeeNode);


        if (head == current){
            head = newEmployeeNode;
        } else {
            newEmployeeNode.getPrevious().setNext(newEmployeeNode);
        }

        size++;
        // add your code here

        return true;
    }


        public EmployeeNode removeFromFront () {
            if (isEmpty()) {
                return null;
            }

            EmployeeNode removedNode = head;

            if (head.getNext() == null) {
                tail = null;
            } else {
                head.getNext().setPrevious(null);
            }

            head = head.getNext();
            size--;
            removedNode.setNext(null);
            return removedNode;
        }

        public EmployeeNode removeFromEnd () {
            if (isEmpty()) {
                return null;
            }

            EmployeeNode removedNode = tail;

            if (tail.getPrevious() == null) {
                head = null;
            } else {
                tail.getPrevious().setNext(null);
            }

            tail = tail.getPrevious();
            size--;
            removedNode.setPrevious(null);
            return removedNode;
        }

        public int getSize () {
            return size;
        }

        public boolean isEmpty () {
            return head == null;
        }

        public void printList () {
            EmployeeNode current = head;
            System.out.print("HEAD -> ");
            while (current != null) {
                System.out.print(current);
                System.out.print(" <=> ");
                current = current.getNext();
            }
            System.out.println("null");
        }

    }
