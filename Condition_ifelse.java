import java.util.Scanner;

public class Condition_ifelse {
    
    public static void main(String[] args) {

        int pwd;
        System.out.print("Enter Password:= ");
        Scanner obj = new Scanner(System.in);
        pwd = obj.nextInt();

        if(pwd ==12234)
        {
            System.out.println("My Name:= Ankit ");
            System.out.println("My Age:= 20 ");
            System.out.println("My Contact:= 993965**** ");
        }
        else
        {
        System.out.print("Wrong Password: ");
        }
        
    }
}
