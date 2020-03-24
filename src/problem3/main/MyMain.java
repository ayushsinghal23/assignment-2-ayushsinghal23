/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;

import java.util.Scanner;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        System.out.println("Welcome to student's roll number arrangement code");
        MyPriorityQueue obj = new MyPriorityQueue();
        while (true) {
            System.out.println("-------------------Press 1 to insert a new rollnumber----------------");
            System.out.println("----------------Press 2 to print the list of rollnumbers-----------------");
            System.out.println("--------------------------Press 3 to exit--------------------");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("-----------you have requested to enter a new value so please enter a new value-----------");
                int valueToBeInserted = scanner.nextInt();
                obj.insertAndArrange(valueToBeInserted);
            } else if (option == 2) {
                System.out.println("-----------You have requested to display the whole list-----------");
                obj.display();
                System.out.println();
            } else if (option == 3) {
                System.out.println("-----------You have quited the program-----------" + "\n" +
                        "-----------         THANK YOU         -----------");
                break;
            }
        }
    }

}