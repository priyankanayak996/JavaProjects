/*Write a Java program to take String input from user and convert into integer,
 catch NumberFormatExcepton if input string is not able to parse in integer.
 */
package learning;
import java.util.Scanner;
public class StringtoInt {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = sr.nextLine();
        try{
            int result=Integer.parseInt(string);
            System.out.println(result);
        }catch(NumberFormatException e){
            System.err.println("Unable to convert input string to int");

        }
    }}
