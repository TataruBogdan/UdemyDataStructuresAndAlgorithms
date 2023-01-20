package com.bogdantataru;

public class Heap {

    private int[] heap;
    private int size; // next available position

    public Heap(int capacity) {
        this.heap = new int[capacity];
    }

    public void insert(int value) {

        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is full");
        }

        heap[size] = value; //constant time

        fixHeapAbove(size); // we have to potentially fix the heap O(log N) - log N swaps for swapping up to the root
        size++;
    }

    //peek method all we're going to do is return heap zero if the heap is not empty.
    //If the heap is empty we're gonna throw in an exception.

    public int peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap id empty");

        }
        else {
            return heap[0];
        }
    }

    //  find the item we want to remove. O(n) - linear
    // once we've found the item we want to delete, once again, we're going to have to fix the heap. O(log n)
    // If you want to delete some random value and you don't have the index, time complexity O(n log n)
    //  N is from having to do the linear search and the log N is from having to fix the heap.
    //   heap, you're really usually only interested in the root - remove the root, you can do that in O of log N time,
    public int delete(int index) {

        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        //this will be the parent of the deleted item,
        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index] = heap[size - 1];
        // is it the root or the replacement value, is less than its parent, we don't have to look up the tree - look below
        if (index == 0 || heap[index] < heap[parent]) {
            fixHeapBelow(index, size -1);
        }
        else {
            fixHeapAbove(index);
        }
        size--;
        return deletedValue;
    }

    public void sort() {

        int lastHeapIndex = size -1;
        for (int i = 0; i < lastHeapIndex; i++){
            int temp = heap[0];
            heap[0] = heap[lastHeapIndex - i];
            heap[lastHeapIndex - i] = temp;

            fixHeapBelow(0, lastHeapIndex - i - 1); // because we wanna exclude where we've put the root,

        }

    }

    private void  fixHeapAbove(int index) {
        int newInsertedValue = heap[index]; // the value we just inserted
        // if we haven't hit the root, and we're gonna compare the new inserted value against the value of its parent
                                            // heap get me the value of the parent of this index and compare it
        while (index > 0 && newInsertedValue > heap[getParent(index)]) {
            // assigning the parent to where the newValue currently lives
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newInsertedValue;
    }

        //index - position that we whant to delete   //this is the last index of the heap.
    private void fixHeapBelow(int index, int lastHeapIndex) {

        int childToSwap;

        //heap[index] = heap[size - 1];
        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);

            // this node has a left child,
            if (leftChild <= lastHeapIndex) {
                // it has a right child? it does not have a right child?
                if (rightChild > lastHeapIndex) {
                    childToSwap = leftChild;
                }
                //we need to swap it with the child that has the largest value,
                else {
                    childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }

                if (heap[index] < heap[childToSwap]) {
                    int temp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = temp;

                }
                else {
                    break;
                }
                index = childToSwap;
            }
            //if the node does not have any children
            else {
                break;
            }
        }
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            System.out.print(", ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public int getParent(int index) {
        return (index - 1) / 2;
        //return (int) Math.floor((index - 1) /2);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getChild(int index, boolean left) {

        return 2 * index + (left ? 1 : 2);

//        if (left){
//            return (2 * index) +1;
//        } else {
//            return (2 * index) +2;
//        }

    }

}
