package com.bogdantataru;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    //add an item to the linked list.
    //for best performance, we should add items to the beginning,
    // so we don't have to traverse the list looking for an insertion point and so, we're going to code an addToFront method.
    public void addFront(Employee employee) {
        /*
        we're inserting the node right at the front of the list, so let's say our list contains employee Jane
        and we're inserting John. When we come in, the head field will be pointing to Jane. When we've finished inserting John,
        we want John to be pointing to Jane and the head field to be pointing to John.
        So, first we create the new node and then we set John which is the new node, John's next field to Jane
        because that's currently the one being pointed to by head and then we set head to John and so,
        we end up with a head field that points to John and John's next field points to Jane
         */

        EmployeeNode node = new EmployeeNode(employee); //creating John -or a new object to be insert into the linkedlist

        // then we need to set this new node's next field.
        // new node's next field is going to point at whatever head it's currently pointing at because when
        // we add a new node to the front of the list, the current head of the list is now going to become
        // the second node in the list and so, this new node is going to point to the current head as we saw in the slides.
        node.setNext(head);
        // the last thing we wanna do is set head to the new node.
        head = node;
        size++;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" => ");
            current= current.getNext();
        }
        System.out.println("null");

    }
    public EmployeeNode removeFromFront(){
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head; // store the first node - pointing to head node
        head = head.getNext();
        size--;
        removedNode.setNext(null); // completely remove Mike - gonna be an isolated node again - garbage collector
        return removedNode;

    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;

    }

}
