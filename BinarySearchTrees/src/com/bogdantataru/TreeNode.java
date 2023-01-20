package com.bogdantataru;

//create a class for a Node
public class TreeNode {

    private int data; // field for the data
    // we need fields for the left child and the right child because each node could potentially have a left child and a right child.
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }


    public void insert(int value) {
        // we need a is empty method ?
        // we're gonna start out by checking whether the value equals the data in this node.
        // is the value equal to the value for this node ?? because if it is it's a duplicate value
        if (value == data) {
            return;
        }

        // then the value in the node we're checking is either less than or greater than the value we wanna insert
        if (value < data) {
            // go to the left. - if doesn't have a left child - create a new leftChild with the data value
            if (leftChild== null) {
                leftChild = new TreeNode(value);
            }
            // if this node does have a left child - we have to check if the leftChild data == value if the data < ... RECURSIVELY
            else {
                leftChild.insert(value);
            }
        }
        else {
            if (rightChild == null){
                rightChild = new TreeNode(value);
            }
            else {
                rightChild.insert(value); // recursively
            }
        }

    }

    public TreeNode get(int value){

        if (value == data) {
            return this; // return this node
        }

        if (value < data){
            // check if there is another left child -- if doesn't exist an left child
            if (leftChild != null) {
                return leftChild.get(value);// because the value doesn't exist
            }
        }
        else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }

        return null;

    }

    public int min(){

        if (leftChild == null){
            return data;
        } else {
            return leftChild.min();
        }
    }

    public int max() {
        if (rightChild == null) {
            return data;
        } else {
            return rightChild.max();
        }
    }



    // this is for THE TREE NODE !!!
    public void traverseInOrder(){

        if (leftChild != null){
            leftChild.traverseInOrder();
        }

        System.out.print(this.data + ", ");
        if (rightChild != null){
            rightChild.traverseInOrder();
        }
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "data = " + data;
    }
}
