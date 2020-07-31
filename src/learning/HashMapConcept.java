/*5. Write a program to store key-value pair as Month Name and its int value (January, 1).

§ Find the month name September in that Map and print its value.

§ Remove month name March*/
package learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapConcept {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        for(int i=0;i<12;i++){

            String a=scan.next();
            int b=scan.nextInt();

            hm.put(a,b);
        }

        for(Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("The set is: " + hm.keySet());
        System.out.println("Is September available in the list: "+hm.containsKey("September"));

        System.out.println(hm.get("September"));
        hm.remove("March");
        System.out.println(hm);

    }
}
