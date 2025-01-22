class Student {
    // Instance variables
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    // Method to check if the student has passed
    public void checkPass() {
        if (marks >= 40) {
            System.out.println(name + " has passed.");
        } else {
            System.out.println(name + " has failed.");
        }
    }
}

public class StudentExample {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student("Ankit Singh", 101, 85.5);

        // Display student details
        student1.displayDetails();

        // Check if the student has passed
        student1.checkPass();
    }
}
