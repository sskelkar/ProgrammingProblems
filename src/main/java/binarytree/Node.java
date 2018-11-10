package binarytree;

public class Node {
    public int data;
    public Node left;
    public Node right;
    public Node next; //used for "populate next right pointer" problem

    public Node(int data) {
        this.data = data;
    }
}
