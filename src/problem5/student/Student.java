/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;

// to store student information and properties
public class Student {
    public String name;
    public int rollNumber;
    public int numberOfBacklogs;
    public int appearingCount;

    public Student(String name, int rollNumber, int numberOfBacklogs, int appearingCount) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.numberOfBacklogs = numberOfBacklogs;
        this.appearingCount = appearingCount;
    }

}
