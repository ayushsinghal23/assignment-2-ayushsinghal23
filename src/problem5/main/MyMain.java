/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;

import java.util.Scanner;

//executable class
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCircularQueue obj = new MyCircularQueue();
        System.out.println("enter the number of observations");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int flag = 0;
            System.out.println("---------------enter the required details---------------");
            System.out.println("enter the name");
            String name = sc.nextLine();
            sc.next();
            System.out.println("enter the rollnumber");
            int rollnumber = sc.nextInt();
            System.out.println("enter the number of backlogs");
            int numberofbacklogs = sc.nextInt();
            int appearingcount = 0;
            System.out.println(" enter the appearing count");
            System.out.println("NOTE: appearingcount must be smaller or equal to number of backlogs and also must not be greater then 2 ");
            while (flag != 1) {
                appearingcount = sc.nextInt();
                if (appearingcount > numberofbacklogs || appearingcount > 2) {
                    System.out.println("You have entered wrong appearingcount enter again");
                } else {
                    flag = 1;
                }
            }
            obj.insert(name, rollnumber, numberofbacklogs, appearingcount);
        }
        obj.filtering();
        System.out.println("------------------                 ------------------" + "\n" + "                  BEFORE PROCESSING                  " + "\n------------------                 ------------------");
        obj.display();
        System.out.println("------------------                 ------------------" + "\n" + "                  AFTER PROCESSING                  " + "\n------------------                 ------------------");

        obj.processingByUsingIteration();
        obj.display();
    }
}

