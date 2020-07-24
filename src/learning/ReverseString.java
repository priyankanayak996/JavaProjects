/*Write a Java program to print reverse
a. User input String (Don’t not use reverse method*/

package learning;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString=scan.next();
        int length=inputString.length();
        String rev="";
        for(int i=length-1;i>=0;i--){
            rev=rev+inputString.charAt(i);
        }
        System.out.println("Reverse of the given string is: "+rev);

    }
}
