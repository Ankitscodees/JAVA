import java.util.Scanner;

public class Conditional_operator {
    
    public static void main(String[] args) {
        
        
        System.out.println("Enter three numers:");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int var = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(var);
    }
}
