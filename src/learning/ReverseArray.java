
//Write a java program to take input of months in String array and print it in reverse order or input
package learning;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] a = new String[12];
        System.out.println("Enter all the months:");
        for (int i = 0; i <a.length; i++) {
            a[i] = scan.next();
        }
        System.out.println("Input array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");

        }
    }}
