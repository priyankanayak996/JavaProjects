
//Write a java program to take input of months in String array and print it in reverse order or input
package learning;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter month name");
        String month[]=new String[12];
        for(int i=0;i<=month.length;i++) {
            month[i]=scan.nextLine();
        }

    }
}
