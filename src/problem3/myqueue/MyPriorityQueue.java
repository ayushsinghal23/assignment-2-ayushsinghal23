/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import org.w3c.dom.ls.LSOutput;
import problem3.node.Node;

public class MyPriorityQueue<E> {

    Node front = null;
    Node rear = null;

    public void insertAndArrange(int valueToBeInserted) {
        Node node = new Node(valueToBeInserted);
        if (front == null && rear == null) {
            front = rear = node;
        } else if (node.getRollNumber() < front.getRollNumber()) {
            node.setNext(front);
            front = node;
        } else if (node.getRollNumber() > rear.getRollNumber()) {
            rear.setNext(node);
            rear = node;
        } else {
            Node current = front;
            while (current.getNext().getRollNumber() < node.getRollNumber()) {
                current = current.getNext();
            }
            node.setNext(current.getNext());
            current.setNext(node);
        }
    }

    public void display() {
        Node current = front;
        System.out.println("the list of arranged rollnumbers is:");
        for (current = front; current != null; current = current.getNext())
            System.out.print(current.getRollNumber() + "----->");
    }

}
