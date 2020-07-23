/* Write a java program to substring a given string

a. First half

b. Second half

c. Middle (minimum 5 alphanumeric)
*/
package learning;
public class Substring {
    public static void main(String args[]){
        String string="Hello World";
        String substring="";
        substring=string.substring(0,5);
        System.out.println("First half "+substring);
        substring=string.substring(6,11);
        System.out.println("Second half "+substring);
        substring=string.substring(2,8);
        System.out.println("Middle "+substring);


    }
}
