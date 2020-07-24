/*6. Write a Java class Car which extends Vehicle class

String name

Long launchYear

Model carModel (Model (String modelName, Date launchDate))

a. Print all the details in printCarDetails methods.*/
import learning.Vehicle;
import java.util.Date;


public class Car extends Vehicle {
    String name;
    String carModelName;
    Long launchYear;


    public void printCarDetails() {
        name = "Chevrolet";
        carModelName = "Colorado";
        launchYear = 2004l;
        System.out.println("Car name is " + name + ",model name is " + carModelName + " and launchyear is " + launchYear);


    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.printCarDetails();
        obj.vehicleFeatures();
         Date launchDate = new Date();
        System.out.println("Model's launch date is "+launchDate.toString());
    }
}

