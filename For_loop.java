import java.util.Scanner;
public class For_loop {
    
    public static void main(String[] args) {
        
        int i,num;
        System.out.print("Enter any Number: ");
        Scanner obj = new Scanner(System.in);

        num = obj.nextInt();

        for(i = 1;i<=10;i++)

            System.out.println(num*i);
    }
}
