package week3;
import java.util.ArrayList;
public class Staff {
    public String name;
    public int age;
    public String contact;
    public ArrayList<String> qualification;
    public double salary;

    public Staff(String name, int age, String contact, ArrayList<String> qualification, double salary){
        this.name=name;
        this.age=age;
        this.contact=contact;
        this.qualification=qualification;
        this.salary=salary;
    }
    public void display(){
        System.out.println("The name of staff is "+ name);
        System.out.println("The age of staff is "+ age);
        System.out.println("The contact of staff is "+ contact);
        for(String q:qualification){
              System.out.println("The qualification of staff is "+ qualification);
        }
        System.out.println("The salary of staff is "+ salary);

    }
    
}
