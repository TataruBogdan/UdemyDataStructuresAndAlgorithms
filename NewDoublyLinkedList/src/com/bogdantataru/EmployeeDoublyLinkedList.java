package com.bogdantataru;

public class EmployeeDoublyLinkedList {

    // doubly linked list we have a field that points to the head,
    public EmployeeNode head;

    //doubly linked list we have a field that points to the tail, or the last node in the list.
    public EmployeeNode tail;

    private int size;

    // method also named insert at head:
    /*
    1. Create a new node "Bill"
    2. Assign "Jane" to the Bill's next field
    3. Assign whatever Jane is pointing to as previous to Bill's previous field
    4. Assign "Bill" to Jane's previous field
    4. Assign head to "Bill"
    5. time complexity - O(1)
     */
    public void addToFront(Employee employee) {
        // Bill
        EmployeeNode node = new EmployeeNode(employee);

        // assign to the new node "Bill"  - as next field  "Jane"
        // TODO - THE case of when we're starting with an empty list because when we're starting with an empty list,
        //  both the head and the tail point to null,and when we add a node to an empty list when we're done, both the head and the tail should be pointing to the node.
        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }


        // assign head to new node "Bill" -  Bill will be the new head of the list
        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        // new employee Bill
        EmployeeNode node = new EmployeeNode(employee);

        // I need the reference to the tail next node
        if (tail == null) {
            head = node;
        } else {
            node.setPrevious(tail);
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    // return we return the node that we deleted.
    public EmployeeNode removeFromFront () {
        if (isEmpty()){
            return null;
        }

        // "Bill" temporary variable
        EmployeeNode removedNode = head;

        if(head.getNext() == null) {
            tail = null;
        }

        head.getNext().setPrevious(head.getPrevious());
        //Assign head to next node
//        head = nextNode; //or
        head = head.getNext();

        //clean out -  set Bill's next field to null
        removedNode.setNext(null);
        size--;
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {

        if (isEmpty()) {
            return null;
        }

        EmployeeNode removeNode = tail;

        //if is the only element in the list
        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(tail.getNext());
        }
        // setting the new tail
        tail = tail.getPrevious();

        size--;
        removeNode.setPrevious(null);
        return removeNode;
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
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }



}
