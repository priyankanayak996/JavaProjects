/*1. Write a Java program to iterate through all elements in a array list

2. Write a Java program to insert an element into the array list at the first position

3. Write a Java program to update specific array element by given element

4. Write a Java program to remove the third element from a array list*/
package learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListQuestions {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            Integer a = scan.nextInt();
            al.add(a);
            System.out.println(al);
        }
        //Adding element at first position
        al.add(0,8);
        //update specific array element by given element
        al.set(2,98);

        //remove the third element from a array list
        al.remove(3);

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }}
