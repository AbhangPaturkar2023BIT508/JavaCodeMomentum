import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private double marks;
    private double totalMarks;
    private char grade;

    public Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
        calculateTotal();
        calculateGrade();
    }

    public void calculateTotal() {
        totalMarks = marks;
    }

    public void calculateGrade() {
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void printData() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating single object
        Student single = new Student(101, "Jack", 85.5);

        System.out.println("Student Information (Single Object):");
        single.printData();
        System.out.println();

        // Creating multiple objects
        Student[] students = {
            new Student(201, "Bob", 92.5),
            new Student(301, "William", 78.0),
            new Student(401, "David", 60.5)
        };

        System.out.println("Student Information (Multiple Objects):");
        for (int i = 0; i < students.length; i++) {
            students[i].printData();
            System.out.println();
        }
    }
}
