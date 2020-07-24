/* Write a java program to substring a given string

a. First half

b. Second half

c. Middle (minimum 5 alphanumeric)
*/
package learning;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string(Min 6 characters): ");
        String string=scan.next();
        String substring="";
        int len=string.length()/2;
        String halfString=string.substring(0, string.length() / 2);
        System.out.println("First half: "+halfString);
        String  secondHalf = string.substring(len / 2);
        System.out.println("Second half: "+secondHalf);
        int k=string.length();
        k=k-5;
        for(int i = k/2 ; i< k/2 + 5; i++)

            System.out.print(string.charAt(i));

    }
}
