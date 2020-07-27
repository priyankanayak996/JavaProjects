/*Assignment-1

· Create a new Class Customer

· Create 2 Class Members - custId and custName

· Add new method print()

· Create instance of the class and invoke print method

Assignment-II

        · Try private and protected access modifiers for Customer class

· Create 2 inner Classes - Address and Contact

        · Try private and protected access modifiers for inner classes

Assignment-III

· Define a static variable custCount. This contains total count of customers

· Create 2 instances of Customer object

· Increment the custCount static variable and print its value after every increment

· Access custCount using class name as well as object name

Assignment-II

· Define a final variable MAXPHONES. This contains maximum allowable phones for a customer record

· Initialize MAXPHONES

· Try to initialize in the constructor

· Access it using class name and object name*/
package learning;
 public class Customer {
    private int custId=23;
    protected String custName="John";
    static int custCount=20;
    final int maxphones;

    public Customer(){
        maxphones=2;
            custCount++;
            //Access custCount using class name
            System.out.println("Number of customer: "+Customer.custCount);

        }

    public void print(){
        System.out.println("Customer's Id is "+custId);
        System.out.println("Customer's Name is "+custName);
    }

  public class Address{
       private String custAddress="USA";
        public void printAddress(){
            System.out.println("Customer's address is "+custAddress);
        }
    }
   public class Contact{
        protected String custContact="9876564324";
            public void printContact(){
                System.out.println("Contact no of Customer is "+custContact);
            }
        }

    public static void main(String[] args){
        Customer obj=new Customer();
        Customer customer1=new Customer();
        Customer customer2=new Customer();
        Customer.Address in=obj.new Address();
        Customer.Contact inner=obj.new Contact();

        obj.print();
        in.printAddress();
        inner.printContact();



        //Access custCount using customer1 object
       System.out.println("Number of customers "+customer1.custCount);

        //Access custCount using customer2 object
        System.out.println("Number of customers "+customer2.custCount);

        //Access MAXPHONES using object name
        System.out.println("maximum allowable phones for a customer record: "+obj.maxphones);

    }
}
