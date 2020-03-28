/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;
import problem4.node.Node;

import java.util.ArrayList;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root = null;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }


    private int leftchildren = 0;
    private int noleftchildcount = 0;
    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<Integer> arr1 = new ArrayList<>();

    public void insert(int value) {
        TreeNode newnode = new TreeNode(value);
        if (root == null) {
            root = newnode;
        } else {
            TreeNode current = root;
            TreeNode parent = null;
            while (true) {
                parent = current;
                if (value < current.getData()) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newnode);
                        return;
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newnode);
                        return;
                    }
                }
            }
        }
    }

    public void inOrder(TreeNode node) {
        if (node == null) {
            return;
        } else {
            inOrder(node.getLeft());
            if (node.getLeft() != null) {
                leftchildren++;
                arr.add(node.getLeft().getData());
            } else if (node.getLeft() == null && node.getRight() != null) {
                noleftchildcount++;
                arr1.add(node.getData());
            }
            System.out.print(node.getData() + " ");
            inOrder(node.getRight());
        }
    }

    public void print() {
        System.out.println();
        System.out.println("number of left children :" + leftchildren);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        System.out.println("Nodes having only right child are:" + noleftchildcount);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.print(arr1.get(i) + " ");
        }
    }
}
