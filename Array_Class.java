import java.util.Arrays;
import java.util.Scanner;
public class Array_Class {
    
    public static void main(String[] args){

        int a[] = new int[5];
        System.out.print("Enter Array Elements:");
        Scanner obj = new Scanner (System.in);
        for(int i=0;i<5;i++)
        {
            a[i] = obj.nextInt();

        }
        Arrays.sort(a);
        System.out.print("Sorted Array Elements\n");
        for(int b: a)
        {
            System.out.print(b+" ");
        }
        
    }
}
