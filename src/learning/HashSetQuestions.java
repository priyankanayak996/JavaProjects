/*1. Write a Java program to iterate through all elements in a hash list.

2. Write a Java program to get the number of elements in a hash set.

3. Write a Java program to convert a hash set to an array*/
package learning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetQuestions {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
                HashSet<String> set=new HashSet();
        for(int i=0;i<5;i++){

            String a=scan.next();
            set.add(a);
            System.out.println(set);
        }
                Iterator<String> i=set.iterator();
                while(i.hasNext())
                {
                    System.out.println(i.next());
                }
        System.out.println("The size of the set is: " + set.size());
        Object[] arr = set.toArray();

        for (int j = 0; j < arr.length; j++){
            System.out.println("Array: "+arr[j]);}
    }
        }



