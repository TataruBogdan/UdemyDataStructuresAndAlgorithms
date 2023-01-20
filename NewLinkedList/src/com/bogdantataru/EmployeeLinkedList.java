package com.bogdantataru;

public class EmployeeLinkedList {

    public EmployeeNode head;

    private int size;

    // method also named insert :
    /*
    1. Create a new node "Bill"
    2. Assign "Jane" to the next field
    3. Assign head to "Bill"
    4. time complexity - O(1)
     */
    public void addToFront(Employee employee) {

        // Bill
        EmployeeNode node = new EmployeeNode(employee);
        // assign to the new node "Bill"  - as next field  "Jane"
        node.setNext(head);
        // assign head to new node "Bill" -  Bill will be the new head of the list
        head = node;
        size++;
    }

    // return we return the node that we deleted.
    public EmployeeNode removeFromFront () {
        if (isEmpty()){
            return null;
        }

        // "Bill" temporary variable
        EmployeeNode removedNode = head;
        // Head next field
        EmployeeNode nextNode = head.getNext();

        //Assign head to next node
//        head = nextNode;
        //or
        head = head.getNext();

        //clean out -  set Bill's next field to null
        removedNode.setNext(null);
        System.out.println("Removed employee: " + removedNode.getEmployee());
        size--;
        return removedNode;

    }



    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public int getSize (){
        return size;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while(current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }



}
