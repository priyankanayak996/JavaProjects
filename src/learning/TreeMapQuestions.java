/*1. Write a Java program to search a key in a Tree Map*/
package learning;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapQuestions {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        for(int i=0;i<5;i++){

            int a=scan.nextInt();
            String b=scan.next();

            map.put(a,b);
        }

        for(Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(map.containsKey(3));


    }
}
