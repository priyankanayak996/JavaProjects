/*6. Write a Java class Car which extends Vehicle class

String name

Long launchYear

Model carModel (Model (String modelName, Date launchDate))

a. Print all the details in printCarDetails methods.*/
package learning;
public class Car extends Vehicle {
    String name;
    String CarModelName;
    Long launchYear;

    public void printCarDetails(){
        name="Chevrolet";
        CarModelName="Colorado";
        launchYear=2004l;
        System.out.println("Car name is "+name+",model name is "+CarModelName+" and launchyear is "+launchYear);

    }
    public static void main(String[] args){
        Car obj=new Car();
        obj.printCarDetails();
        obj.VehcileFeatures();
    }

}
