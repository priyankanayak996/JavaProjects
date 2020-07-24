/*4. Write a Java class Animal (id, name, age, color) whose object can be created as below

a. Without any argument

b. With one argument

c. With 3 argument
*/package learning;
public class Animal {
    int id;
    String name;
    int age;
    String color;
    Animal(){
        System.out.println("Class Animal");
    }
    Animal(String c,String n){
        name=n;
        color=c;
    }
    Animal(int i,int a,String c){
        id=i;
        age=a;
        color=c;
    }
    public static void main(String[] args){
        Animal obj=new Animal();
        Animal obj1=new Animal("black","buzo");
        System.out.println("Color of the animal is "+obj1.color+" and name of the animal is "+obj1.name);

        Animal obj2=new Animal(4,8,"brown");
        System.out.println("Color of the animal is "+obj2.color+",id is "+obj2.id+" and age is "+obj2.age);

    }
}
