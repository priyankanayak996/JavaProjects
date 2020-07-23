/*Write a Java program to take String input from user and convert into integer,
 catch NumberFormatExcepton if input string is not able to parse in integer.
 */
package learning;
import java.util.Scanner;
public class StringtoInt {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sr.nextLine();
        int i=Integer.parseInt(s);
        try {
             i = Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println("Please enter a number not string");


        }
    }}
