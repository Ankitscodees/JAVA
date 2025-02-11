// Define a class
class Student {
    // Properties (attributes)
    String name;
    int rollNumber;
    double marks1, marks2, marks3;

    // Constructor to initialize student details
    Student(String studentName, int roll, double m1, double m2, double m3) {
        name = studentName;
        rollNumber = roll;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    // Method to calculate total marks
    double calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    // Method to calculate percentage
    double calculatePercentage() {
        return (calculateTotal() / 300) * 100;  // Assuming each subject is out of 100
    }

    // Method to determine grade
    String determineGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else return "F (Fail)";
    }

    // Method to display student details and report
    void displayReportCard() {
        System.out.println("\n📄 Student Report Card 📄");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + calculateTotal() + " / 300");
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Grade: " + determineGrade());
    }
}

// Main class to create objects
public class StudentReportCard {
    public static void main(String[] args) {
        // Creating an object of Student class
        Student student1 = new Student("Ankit Singh", 101, 85, 90, 88);

        // Displaying the report card
        student1.displayReportCard();
    }
}
