//Q4. Write a program to input n numbers on command line argument and calculate maximum of them.
package learning;
import java.util.Scanner;
public class MaxNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        int number = scan.nextInt();
        int[] a = new int[number];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < number; i++)
        {
            a[i] = scan.nextInt();
        }
       int max = a[0];
        for(int i = 0; i < number; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);
    }
}
