/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;

//executable class
public class MyMain {
    public static void main(String[] args) {

        MyCircularQueue obj = new MyCircularQueue();
//        obj.insert("ayush", 1, 0);
        obj.insert("a", 1, 0);
        obj.insert("b", 2, 1);
        obj.insert("c", 3, 2);
        obj.display();
        System.out.println("-------------------------------");
        obj.DeleteNode();
        // obj.display();
    }
}
