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

    public void insert(String name, int rollNumber, int numberOfBacklogs) {
        Node node = new Node(name, rollNumber, numberOfBacklogs);
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.setNext(node);
            node.setNext(front);
            rear = node;
        }
//        else if (node.getData().getRollNumber() < front.getData().getRollNumber()) {
//            node.setNext(front);
//            front = node;
//            rear.setNext(front);
//        } else if (node.getData().getRollNumber() > rear.getData().getRollNumber()) {
//            rear.setNext(node);
//            rear = node;
//            rear.setNext(front);
//        } else {
//            Node current = front;
//            while (current.getData().getRollNumber() <= node.getData().getRollNumber()) {
//                current = current.getNext();
//            }
//            node.setNext(current.getNext());
//            current.setNext(node);
//        }
    }

    public void DeleteNode() {
        Node current = front;

        while (true) {
            if (current == null) {
                System.out.println("empty");
                break;
            } else if (current == front && current == rear) {
                if (current.getData().getNumberOfBacklogs() == 0) {
                    front = rear = null;
                    System.out.println("now empty");
                }
                break;
            } else if (current.getNext().getData().getNumberOfBacklogs() == 0) {
                if (current.getNext() == rear) {
                    current.setNext(front);
                    current = rear;
                    break;
                } else {
                    current.setNext(current.getNext().getNext());
                    continue;
                }
            } else {
                if (current.getNext() != front) {
                    current = current.getNext();
                } else {
                    break;
                }
//        while (true) {
//            if (current == null) {
//                System.out.println("THE QUEUE WAS ALREADY EMPTY");
//                break;
//            } else if (current == front && current == rear && current.getData().getNumberOfBacklogs() == 0) {
//                front = rear = null;
//                System.out.println("NOW THE QUEUE IS COMPLETELY EMPTY");
//                break;
//            } else if (current.getNext() == rear && rear.getData().getNumberOfBacklogs() == 0) {
//                current.setNext(front);
//                current = rear;
//                break;
//            }
////                while (current.getNext() != front) {
//            else if (current.getNext().getData().getNumberOfBacklogs() == 0) {
//                current.setNext(current.getNext().getNext());
//                continue;
//            } else {
//                if (current.getNext() != front) {
//                    current = current.getNext();
//                } else {
//                    break;
//                }
//            }
//        }
//        if (front.getData().getNumberOfBacklogs() == 0) {
//            rear.setNext(front.getNext());
//            front = front.getNext();
//        }

//        if (front == null) {
//            System.out.println("queue was already empty!!!");
//        } else if (front == rear) {
//            front = rear = null;
//            System.out.println("THE QUEUE IS EMPTY");
//        } else {
//            Node current = front;
//            Node previousRear = null;
//
//            while (current != rear) {
//                if (current.getNext() == rear) {
//                    previousRear = current;
//                }
//                if (current == front && front.getData().getNumberOfBacklogs() == 0) {
//                    rear.setNext(front.getNext());
//                    front = front.getNext();
//                } else if (current.getNext().getData().getNumberOfBacklogs() == 0) {
//                    current.setNext(current.getNext().getNext());
//                } else {
//                    current = current.getNext();
//                }
//            }
//            if (rear.getData().getNumberOfBacklogs() == 0) {
//                previousRear.setNext(rear.getNext());
//                rear = previousRear;
//            }
//        }
            }
        }
        if (front.getData().getNumberOfBacklogs() == 0) {
            rear.setNext(front.getNext());
            front = front.getNext();
        }
    }

    public void display() {
        Node current = rear;
        if (front == null) {
            System.out.println("queue is empty!!!");
        } else {
            while (current.getNext() != rear) {
                System.out.print(current.getData().toString() + "------->");
                current = current.getNext();
            }
            System.out.println(current.getData().toString() + "------>");
            // System.out.println(current.getNext().getData().toString());
        }
    }
}