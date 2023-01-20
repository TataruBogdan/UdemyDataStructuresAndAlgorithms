package com.bogdantataru;

/*
So for a linked list, the only thing you have to store is a reference to the head or the first node in the list. And from that, you can get to every item in the list.
insert an item into this list - So let's say we wanted to insert Bill.(1.create a new node "Bill"),
always insert a new element at the front of the list.( We only ever store a reference to the first element)-
do it in constant time complexity, because the steps you have to do don't depend on the number of items in the list - same number of steps.
node "Bill" point to "Jane" we'll assign the next field Jane, and then we're gonna assign head to Bill, because Bill will be the new head of the list,
2.assign head to Bill   <-  1. next field
                 Head    -> Node ->        Node  -> Node -> null
                "Bill"     "Jane"         "Mary"   "Mike"
We create the actual node instance. We point the next field at the current head of the list because the new node is gonna become the new head,
and then we point the head field at the new node.
time complexity O(1) - because it doesn't matter. You could have three items in the list or a million items in the list,
the same number of steps, as long as you're inserting at the front of the list.
As long as you're inserting and deleting from the front of the list, the insertions and deletions are done in constant time O(1) - because there's no shifting involved.
 */

/*
So, the first class we'll work on is the node class and this class is going to need two variables, one for the employee instance and one for the next node in the list
because remember, when we're working with a linked list, every node knows about the next node in the list and so, we need a field that contains a reference to the next node in the list
and that's why the data structure is called a linked list
by contains a link, we mean that it stores the object reference of the next node.
 */

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones",  123);
        Employee johnDoe = new Employee("John", "Doe",  4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike",  "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addFront(janeJones);
        list.addFront(johnDoe);
        list.addFront(marySmith);
        list.addFront(mikeWilson);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();

        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());



    }
}
