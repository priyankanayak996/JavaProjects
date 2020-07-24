//Q4. Write a program to input n numbers on command line argument and calculate maximum of them.
package learning;
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        int num = scanner.nextInt();

        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            num = input;
        }
        System.out.println("Max no is: "+num);



}
}
