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
    public TreeNode root = null;


    //    public void insert(int value) {
//        TreeNode newnode = new TreeNode(value);
//        if (root == null) {
//            root = newnode;
//        } else {
//            TreeNode current = root;
//            while (true) {
////                TreeNode parent = null;
//                if (current.data == value) {
//                    System.out.println("DUPLICATE VALUE NOT ALLOWED");
//                    return;
//                } else if (value < current.data) {
//                    if (current.left == null) {
//                        current = current.left;
//                        current = newnode;
//                        return;
//                    } else {
//                        current = current.left;
//                    }
//                } else if (value > current.data) {
//                    if (current.right == null) {
//                        current = current.right;
//                        current = newnode;
//                        return;
//                    } else {
//                        current = current.right;
//                    }
//                }
//            }
//        }
//    }
    public int leftchildren = 0;
    public int noleftchildcount = 0;
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
                if (value < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newnode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newnode;
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
            inOrder(node.left);
            if (node.left != null) {
                leftchildren++;
                arr.add(node.left.data);
            } else if (node.left == null && node.right != null) {
                noleftchildcount++;
                arr1.add(node.right.data);
            }
            System.out.print(node.data + " ");
            inOrder(node.right);
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
