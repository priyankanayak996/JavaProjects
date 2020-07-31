/*1. Write a Java program to associate the specified value with the specified key in a HashMap

2. Write a Java program to copy all of the mappings from the specified map to another map

3. Write a Java program to get the value of a specified key in a map*/
package learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapQuestions {
    public static void main(String[] args){
        HashMap<Integer,String> hmap=new HashMap<Integer,String>();
        HashMap<Integer,String> hmap2=new HashMap<Integer,String>();
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<5;i++){

            int a=scan.nextInt();
            String b=scan.next();

            hmap.put(a,b);
        }

        for(Map.Entry m:hmap.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        hmap2.putAll(hmap);
        System.out.println("values in second map: " + hmap2);

        System.out.println("Value at 4th position is: "+hmap.get(4));
}}
