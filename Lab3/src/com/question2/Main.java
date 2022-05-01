package com.question2;

public class Main {
    static BST tree = new BST();
    public static void main(String[] args) {
        // Create BST
        Node root = null;
        root = tree.Insert(root, 40);
        root = tree.Insert(root, 20);
        root = tree.Insert(root, 60);
        root = tree.Insert(root, 10);
        root = tree.Insert(root, 30);
        root = tree.Insert(root, 50);
        root = tree.Insert(root, 70);

        int sum = 130;
        // Call FindPair function
        tree.FindPair(root, sum);
    }
}