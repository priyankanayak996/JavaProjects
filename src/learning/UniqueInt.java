/*3. Write a Java program which can store any integer value uniquely,
 input can be duplicate provided by user in console.
*/package learning;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueInt {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<5;i++){

           int a=scan.nextInt();
            al.add(a);
            System.out.println(al);
       }

    }
}
