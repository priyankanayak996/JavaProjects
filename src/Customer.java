/*Assignment-1

· Create a new Class Customer

· Create 2 Class Members - custId and custName

· Add new method print()

· Create instance of the class and invoke print method

Assignment-II

        · Try private and protected access modifiers for Customer class

· Create 2 inner Classes - Address and Contact

        · Try private and protected access modifiers for inner classes*/

public class Customer {
    int custId=23;
    String custName="John";

    public static void main(String args[]){
        Customer obj=new Customer();

        obj.Print();
    }
    public void Print(){
        System.out.println("Customer Id is "+custId);
        System.out.println("Customer name is "+custName);

    }
}
