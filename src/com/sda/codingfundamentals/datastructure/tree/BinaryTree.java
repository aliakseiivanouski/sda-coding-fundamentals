package com.sda.codingfundamentals.datastructure.tree;

public class BinaryTree {

    private Node root;


    //Inserting
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    private void add(int value) {
        root = addRecursive(root, value);
    }

    private static BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }


    //Finding
    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    private boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }


    //Deleting
    private Node deleteRecursive(Node current, int value) {
        /* Base Case: If the tree is empty */
        if (current == null) {
            return current;
        }

        /* Otherwise, recur down the tree */
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = deleteRecursive(current.right, value);

            // if key is same as root's key, then This is the node
            // to be deleted
        } else {
            // node with only one child or no child
            if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            }

            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            current.value = findSmallestValue(current.right);

            // Delete the inorder successor
            current.right = deleteRecursive(current.right, current.value);
        }

        return current;

    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    private void delete(int value) {
        root = deleteRecursive(root, value);
    }


    public static void main(String[] args) {
        BinaryTree bt = createBinaryTree();

        System.out.println("======== Insert node =========");
        System.out.println("Binary tree contains 10: " + bt.containsNode(10));
        bt.add(10);
        System.out.println("Binary tree contains 10: " + bt.containsNode(10));

        System.out.println("======== Check if tree contains node =========");
        System.out.println("Binary tree contains 6: " + bt.containsNode(6));
        System.out.println("Binary tree contains 4: " + bt.containsNode(4));

        System.out.println("Binary tree contains 1: " + bt.containsNode(1));


        System.out.println("======== Delete node =========");
        System.out.println("Binary tree contains 9: " + bt.containsNode(9));
        bt.delete(9);
        System.out.println("Binary tree contains 9: " + bt.containsNode(9));
    }

}
