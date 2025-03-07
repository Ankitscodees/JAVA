import java.util.Scanner;
import java.util.Arrays;
public class Sorted_Arrays {
    
    public static void main(String[] args) {
        
        int a[] = new int[5];
        System.out.print("Enter Array Elements: ");
        Scanner obj = new Scanner(System.in);
        for(int i =0;i<5;i++)

        {
            a[i] = obj.nextInt();

        }
        Arrays.sort(a);
        System.out.println("Sorted Array Elements:\n");
        for(int b:a)
        {
            System.out.println(b+" ");
        }
    }
}
