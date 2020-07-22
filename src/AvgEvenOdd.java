import java.util.ArrayList;

/*Q2. Write a program to print the sum and average of the even and odd numbers separately.
 Given on command line argument.
*/
public class AvgEvenOdd {
    public static void main(String[] args){
        int a[]={8,5,9,7,2,3,4};
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0) {
                al1.add(a[i]);
            }
            else{
                al2.add(a[i]);
            }
        }
        int sumEven=0;
        int avgEven=0;
        for(int no:al1){
            sumEven=sumEven+no;
            avgEven=sumEven/al1.size();
        }
        System.out.println("Sum of even numbers is: "+sumEven);
        System.out.println("Average of even numbers is: "+avgEven);

        int sumOdd=0;
        int avgOdd=0;
        for(int no:al2){
            sumOdd=sumOdd+no;
            avgOdd=sumOdd/al2.size();
        }
        System.out.println("Sum of odd numbers is: "+sumOdd);
        System.out.println("Average of odd numbers is: "+avgOdd);


    }

}
