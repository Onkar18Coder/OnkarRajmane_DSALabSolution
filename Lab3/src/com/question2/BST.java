package com.question2;

import java.util.ArrayList;

public class BST {
    public static Node root;

    public Node Insert(Node root, int data) {
        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = Insert(root.left, data);
        else
            root.right = Insert(root.right, data);

        return root;
    }

    // Convert Tree to ArrayList
    ArrayList<Integer> TreeToList(Node node, ArrayList<Integer> list) {
        if (node == null)
            return list;

        TreeToList(node.left, list);
        list.add(node.data);
        TreeToList(node.right, list);

        return list;
    }

    public void FindPair(Node root, int sum) {
        ArrayList<Integer> list = new ArrayList<>();

        list = TreeToList(root, list);

        int start = 0;
        int end = list.size()-1;

        // Traverse list and find pairs
        while (start<end) {
            if (list.get(start) + list.get(end) == sum) {
                System.out.println("Pair Found: " + list.get(start) + "," + list.get(end));
                return;
            }
            if (list.get(start) + list.get(end) > sum)
                end --;
            if (list.get(start) + list.get(end) < sum)
                start++;
        }
        System.out.println("No Pairs Found!");
    }
}