/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem4.myqueue.MyQueue;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue object = new MyQueue();
        System.out.println("enter the number of elements you want to enter in the tree");
        int sizeOfTree = sc.nextInt();
        for (int i = 0; i < sizeOfTree; i++) {
            System.out.println("enter the value to insert in the tree");
            int value = sc.nextInt();
            object.insert(value);
        }
        int middle = sizeOfTree / 2;
        object.postorder(object.root);
        object.preorder(object.root);
        object.printPreOrder();
        object.printPostOrder();
        object.checkOpposites();
        object.checkMiddles(middle);
    }
}
