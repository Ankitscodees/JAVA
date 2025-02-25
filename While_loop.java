import java.util.Scanner;

public class While_loop {
    
    public static void main(String[] args) {
        
        int num;
        System.out.println("Enter any Number ");
        Scanner obj = new Scanner(System.in);

        num = obj.nextInt();
        while (num >=0)
        {
            if (num % 2 == 0) 
            {
                
                System.out.println("Even Number:");
            }
            else
            {
                System.out.println("Odd Number:");
                break;
            }
             
        }
        System.out.println("While loop ended:");
        
    }
}
