/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree obj = new MyBinarySearchTree();
//        obj.insert(16);
//        obj.insert(12);
//        obj.insert(8);
//        obj.insert(14);
//        obj.insert(6);
//        obj.insert(10);
//        obj.insert(32);
//        obj.insert(22);
//        obj.insert(64);
//        obj.insert(18);
//        obj.insert(26);
//        obj.insert(128);
//        obj.insert(264);
        System.out.println("enter the size of the tree");
        int sizeOfTree = sc.nextInt();
        for (int i = 0; i < sizeOfTree; i++) {
            System.out.println("enter the value of the value");
            int value = sc.nextInt();
            obj.insert(value);
        }
        System.out.println("_________________INORDER TRAVERSAL_________________");
        obj.inOrder(obj.root);
        obj.print();
    }
}
