class Student {
    String name;
    int rollNumber;
    double marks;

    // Constructor 
    Student(String studentName, int studentRoll, double studentMarks) {
        name = studentName;
        rollNumber = studentRoll;
        marks = studentMarks;
    }

    void displayStudentInfo() {
        System.out.println("\n🎓 Student Report 🎓");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);

        // Determine grade
        if (marks >= 90) {
            System.out.println("Grade: A+ 🌟");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F ❌ (Failed)");
        }
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Ankit Singh", 101, 85.5);
        Student student2 = new Student("Rahul Sharma", 102, 39.0);

        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}
