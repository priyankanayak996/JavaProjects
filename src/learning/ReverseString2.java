/*Write a Java program to print reverse
* b. User input String with reverse method*/
package learning;
import java.util.Scanner;
 public class ReverseString2 {


        public static void main(String args[]){
            String rev="";
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a string:");
            String inputString=scan.next();
            StringBuffer sb=new StringBuffer(inputString);
            rev=sb.reverse().toString();
            System.out.println("Reverse of the given string is: "+rev);

        }
    }

