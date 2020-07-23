/*Write a Java program to print reverse
  c. User input */
package learning;
import java.util.Scanner;
public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=scan.nextInt();
            int reversed = 0;

            while(num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

            System.out.println("Reversed Number: " + reversed);
        }
    }

