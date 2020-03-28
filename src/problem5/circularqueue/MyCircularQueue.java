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
    private Node front = null;
    private Node rear = null;

    public void insert(String name, int rollnumber, int noofbacklogs, int appearingcount) {
        Node newnode = new Node(name, rollnumber, noofbacklogs, appearingcount);
        if (front == null) {
            front = newnode;
            rear = newnode;
        } else {
            rear.setNext(newnode);
            newnode.setNext(front);
            rear = newnode;
        }
    }

    public void filtering() {
        Node current = front;
        if ( front == rear) {
            if (front.getData().getNumberOfBacklogs() == 0 ) {
                front = rear = null;
            }
            return;
        }else {
            while (current.getNext() != front) {
                if (current.getNext().getData().getNumberOfBacklogs() == 0 && current.getNext() == rear) {
                    current.setNext(front);
                    rear = current;
//                    System.out.println("rear");
                } else if (current.getNext().getData().getNumberOfBacklogs() == 0) {
                    current.setNext(current.getNext().getNext());
                    System.out.println(current.getNext().getData().getName());
//                    System.out.println("normal");
                } else {
                    current = current.getNext();
                }
            }
        }

            if (front.getData().getNumberOfBacklogs() == 0) {
                front = front.getNext();
                rear.setNext(front);
//                System.out.println("front");
            }
        }


    public void processingByUsingIteration() {
        Node current = front;
        if (front == null) {
//            System.out.println("Queue is Empty");
            return;
        } else {
            while (current != rear) {
                current.getData().setNumberOfBacklogs(current.getData().getNumberOfBacklogs() - current.getData().getAppearingCount());
                current = current.getNext();
            }
            rear.getData().setNumberOfBacklogs(rear.getData().getNumberOfBacklogs() - rear.getData().getAppearingCount());
        }

    }

    public void display() {
        Node current = front;
        if (front == null) {
            System.out.println("the queue is empty");
            return;
        } else {
            while (current != rear) {
                System.out.print("name is: " + current.getData().getName() + "\n" + "Rollnumber is: " + current.getData().getRollNumber() + "\n" +
                        "number of backlogs: " + current.getData().getNumberOfBacklogs() + '\n' + "Appearing count: " + current.getData().getAppearingCount() + "\n");
                System.out.println("----------------------------------------------------------");
                current = current.getNext();
            }
            System.out.print("name is: " + rear.getData().getName() + "\n" + "Rollnumber is: " + rear.getData().getRollNumber() + "\n" +
                    "number of backlogs: " + rear.getData().getNumberOfBacklogs() + '\n' + "Appearing count: " + rear.getData().getAppearingCount() + "\n");
        }
    }
}