package com.bogdantataru;

/*
So in general to insert a node A between nodes B and C, we want to plop A between B and C.
And we're gonna assign A's next field to B's next field because B's next field will be pointing to C.
And we're gonna put A between them.
We're gonna assign A's previous field to C's previous field because C's previous field will be B.
And we want A, we're gonna drop A in between them, so we're gonna want A's previous field to be B.
And then we assign B's next field to A. And C's previous field to A.
Now to do those four steps is constant time but,unless we're doing this at the beginning or the end of the list we have to find nodes B and C first.
And we're gonna have to traverse the list to do that.
worst case for this is actually linear time O(n)

To remove a node A from between B and C, so this time we have nodes B followed by A followed by C, we assign A to remove node.
We want C's previous field to now point to B because we're removing A. So we'll assign C's previous field to A's previous field.
Because A's previous field is pointing to B.
 We want B's next field to point to C. So we'll assign B's next field with whatever A's next field
is pointing at because A's next field is currently pointing to C because it's in between them.
And then we just return A from the method.
steps are constant time - But, we have to find A first in the list. So unless A is at the head or the tail, we're gonna have to find it.
the worst case for this would actually be linear time.O(n)
 */


import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {



        Employee janeJones = new Employee("Jane", "Jones",  123);
        Employee johnDoe = new Employee("John", "Doe",  4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike",  "Wilson", 3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        System.out.println(list.isEmpty());


        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());


        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());

        LinkedList JdkLinkedList = new LinkedList();

    }
}
