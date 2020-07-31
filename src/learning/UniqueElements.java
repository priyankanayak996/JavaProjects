/*4. Write a java program to store String in sorted order uniquely. Input provides by user*/
package learning;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueElements {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Set <String> hashset=new HashSet<String>();
        for(int i=0;i<5;i++){

            String a=scan.next();
            hashset.add(a);
            System.out.println(hashset);
        }

    }
}
