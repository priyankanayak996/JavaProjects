/* Write a program to print the following pattern given n as argument: - for input 3

1

2 2

3 3 3
*/

public class Pattern {
    public static void main(String[] args){

        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");

        }

    }
}
