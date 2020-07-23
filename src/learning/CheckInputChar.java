/*Q.5 WAP in java to check the input characters for uppercase, lowercase, number of digits and
 other characters.*/
package learning;
import java.util.Scanner;
public class CheckInputChar {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        char num;
        System.out.println("Enter character: ");
        char ch=scan.next().charAt(0);
        if(ch>=65 && ch<=90){
            System.out.println("Uppercase");
        }else if(ch>=97 && ch<=122){
            System.out.println("lowercase");
        }
        else if(ch>=48 && ch<=57) {
            System.out.println("digits");
        }else{
            System.out.println("Other characters");
        }


    }
}
