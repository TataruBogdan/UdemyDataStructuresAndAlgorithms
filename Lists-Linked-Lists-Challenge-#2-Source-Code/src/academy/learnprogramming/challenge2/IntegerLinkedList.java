package academy.learnprogramming.challenge2;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    //challenge
    public void insertSorted(Integer value) {

        IntegerNode node = new IntegerNode(value);

        if (head == null || head.getValue() >= value){
            node.setNext(head);
            head = node;
            size++;
            return;
        }
        //current is the first element from sorted part
        //Integer headValue = head.getValue();
        IntegerNode current = head.getNext();
        IntegerNode previous = head;

        while (current !=null && current.getValue() < value) {
            previous = current;
            current = current.getNext();
        }

        previous.setNext(node);
        node.setNext(current);

        size++;

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
