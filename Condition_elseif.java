import java.util.Scanner;

public class Condition_elseif {
    
    public static void main(String[] args) {
        
        int marks;
        System.out.print("Enter Marks: ");
        Scanner obj = new Scanner(System.in);
        marks = obj.nextInt();
        if(marks >=60 && marks<=100)
        {
            System.out.print("First Division: ");
        }
        else if(marks >=40 && marks < 60)
        {
            System.out.print("Second Division ");
        }
        else if(marks >= 33 && marks < 40)
        {
            System.out.print("Pass ");
        }
        else
        {
            System.out.print("Failed ");
        }
    }
}
