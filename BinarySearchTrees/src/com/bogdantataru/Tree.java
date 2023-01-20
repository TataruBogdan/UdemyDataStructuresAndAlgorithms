package com.bogdantataru;


// we need a class for the tree itself
public class Tree {

    // we only need one field in the tree and that's the root node
    // because if we have the root we can get to everything else.

    private TreeNode root;

    //this is what a caller would actually call, to insert a value into the tree.
    public void insert(int value) {

        //  first thing we're gonna check is if the root is null because if the root is null then whatever inserting just becomes the root node.
        // create a Tree node to insert value
        if (root == null) {
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }



    public void traverseInOrder(){
        if (root != null){
            root.traverseInOrder();
        }
    }

    // get return the tree node we are deleting
    public TreeNode get(int value){
        if (root != null){
            return root.get(value);
        }
        return null;
    }

    public void delete(int value){
        // we're passing the root of the subtree that we want to search for the value.
        // first we wanna search the Tree.
        // we're passing the root and then we're passing the value that we want to delete.

        root = delete(root, value);// delete-  going to return is the root of the Tree.
    }
    // essentially returns the replacement node. If a node doesn't have to be replaced, then you just get the same node back.
    //  root of the subtree we wanna search
    private TreeNode delete (TreeNode subtreeRoot, int value){
        //  case of the Tree being empty.
        if (subtreeRoot == null) {
            return subtreeRoot; // returning null.
        }
        // search the left subtree
        if( value < subtreeRoot.getData()) {
            //delete returns the replacement node.
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        }
        else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        }
        // value == subtreeRoot.getData()
        else {
            // Cases 1 and 2 : node to delete has 0 or 1 child(ren)
            if (subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getRightChild(); // because if the subtree Node is a leaf the the right Child is also null
            }
            else if (subtreeRoot.getRightChild()== null) {
                return subtreeRoot.getLeftChild();
            }

            // Case 3: node to delete has 2 children

            // Replace the value in the subtreeRoo node with the smallest value from the subtree right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            // Delete the node that has the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
        }
        return subtreeRoot;
    }

    public int min(){

        if (root == null){
            return Integer.MIN_VALUE;
        }else {
            return root.min();
        }
    }

    public int max(){
        if (root == null){
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }

}
