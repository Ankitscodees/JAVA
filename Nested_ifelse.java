import java.util.Scanner;

public class Nested_ifelse {
    
    public static void main(String[] args) {
        
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter Three Numbers: ");
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int num3 = obj.nextInt();

        if(num1>num2)

        {
            if(num1>num3)
            {
                System.out.println("Maximum Numbers: "+num1);
            }
            else
            {
                System.out.println("Maximum Numbers: "+num3);

            }
        }
        else
        {
            if(num2>num3)
            {
                System.out.println("Maximum Numbers: "+num2);
            }
            else
            {
                System.out.println("Maximum Numbers: "+num3);

            }
        }
    }
}
