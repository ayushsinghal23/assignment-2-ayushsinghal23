/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;

// to store student information and properties
public class Student {
    private String name;
    private int rollNumber;
    private int numberOfBacklogs;

    public Student(String name, int rollNumber, int numberOfBacklogs) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.numberOfBacklogs = numberOfBacklogs;
    }

    @Override
    public String toString() {
        return ("Student" +
                "name=" + name + '\n' +
                "rollNumber=" + rollNumber + "\n" +
                "numberOfBacklogs=" + numberOfBacklogs);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getNumberOfBacklogs() {
        return numberOfBacklogs;
    }

    public void setNumberOfBacklogs(int numberOfBacklogs) {
        this.numberOfBacklogs = numberOfBacklogs;
    }
}
