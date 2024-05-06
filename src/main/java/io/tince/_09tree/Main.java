package io.tince._09tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(27);
        System.out.println("root: " + myBST.getRoot().value);
        System.out.println(myBST.getRoot().left.right.value);
        System.out.println("27 contains in BinarySearchTree? " + myBST.contains(27));
        System.out.println("17 contains in BinarySearchTree? " + myBST.contains(17));
    }
}
