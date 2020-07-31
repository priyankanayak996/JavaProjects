/*1. Write a Java program to insert Colors name (String) in ArrayList. Make sure list has color name Pink

a. Sort it using Collections class on alphabetical order ascending

b. Insert a month name (February) after color name “Pink”

c. Find if above list has color name “Red”

d. Remove month name February from List

e. Create another ArrayList having month name

f. Add this collection(list) to color collection(list)

g. Print the size of List (use List method)*/
package learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListColors {
    public static void main(String[] args){

        //Collection
        Scanner scan=new Scanner(System.in);
        ArrayList<String> colors=new ArrayList<String>();
        System.out.println("Enter color names: ");
        for(int i=0;i<5;i++){

            String a=scan.next();
            colors.add(a);
            System.out.println(colors);
        }

        //Sorting in ascending order
        Collections.sort(colors);
        for(String color:colors)
            System.out.println(color);

        //Checking if list has color "Red"
        System.out.println("Is Red available in the list: "+colors.contains("Red"));

        //Checking if list has color "Pink"
        System.out.println("Is Red available in the list: "+colors.contains("Pink"));

        if(colors.contains("Pink")==true){
        //Finding index of Pink
        System.out.println("The index of pink is: "+colors.indexOf("Pink"));}


       colors.add(2,"February");
        System.out.println(colors);
        colors.remove("February");
        System.out.println(colors);

        ArrayList<String> months=new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        colors.addAll(months);
        System.out.println(colors);

        int size = months.size();
        System.out.println("Size of list: "+size);



    }
}
