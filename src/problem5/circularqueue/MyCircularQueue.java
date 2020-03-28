/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;

import javax.swing.*;

//to implement circular queue
public class MyCircularQueue {
    Node front = null;
    Node rear = null;

    public void insert(String name, int rollnumber, int noofbacklogs, int appearingcount) {
        Node newnode = new Node(name, rollnumber, noofbacklogs, appearingcount);
        if (front == null) {
            front = newnode;
            rear = newnode;
        } else {
            rear.next = newnode;
            newnode.next = front;
            rear = newnode;
        }
    }

    public void filtering() {
        Node current = front;
        while (current.next != front) {
            if (current.next.data.numberOfBacklogs == 0 && current.next == rear) {
                current.next = front;
                rear = current;
            } else if (current.next.data.numberOfBacklogs == 0) {
                current.next = current.next.next;
//                dequeue(current, current.next);
            } else {
                current = current.next;
            }
        }
        if (front.data.numberOfBacklogs == 0 && front == rear) {
            front = rear = null;
        } else if (front.data.numberOfBacklogs == 0) {
            front = front.next;
            rear.next = front;
        }
    }

    public void processingByUsingIteration() {
        Node current = front;
        if (front == null) {
            System.out.println("Queue is Empty");
        } else {
            while (current != rear) {
                current.data.numberOfBacklogs = current.data.numberOfBacklogs - current.data.appearingCount;
                current = current.next;
            }
            rear.data.numberOfBacklogs = rear.data.numberOfBacklogs - rear.data.appearingCount;
        }

    }

    public void display() {
        Node current = front;
        if (front == null) {
            System.out.println("the queue is empty");
            return;
        } else {
            while (current != rear) {
                System.out.print("name is: " + current.data.name + "\n" + "Rollnumber is: " + current.data.rollNumber + "\n" +
                        "number of backlogs: " + current.data.numberOfBacklogs + '\n' + "Appearing count: " + current.data.appearingCount + "\n");
                System.out.println("----------------------------------------------------------");
                current = current.next;
            }
            System.out.print("name is: " + rear.data.name + "\n" + "Rollnumber is: " + rear.data.rollNumber + "\n" +
                    "number of backlogs: " + rear.data.numberOfBacklogs + '\n' + "Appearing count: " + rear.data.appearingCount + "\n");
        }
    }
}