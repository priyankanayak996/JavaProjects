//Write a Java program to find the factorial of a number.
package learning;
 import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner obj=new Scanner(System.in);
    int number=obj.nextInt();
    int fact =1;
    for(int i=number;i>=1;i--){
        fact=fact*i;
    }
        System.out.println("Factorial of "+number+" is "+fact);
}}
