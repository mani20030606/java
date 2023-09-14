//java program to demonstrate the usage of "this" keyword in java
//14.09.23
import java.io.*;
class Student{
    int rollnumber;
    String name;
    float fee;
    Student (int rollnumber,String name,float fee)
    {
        this.rollnumber=rollnumber;
        this.name=name;
        this.fee=fee;
        
    }

void display(){
    System.out.println("Student details are:");
    System.out.println(rollnumber+" "+name+" "+fee+" ");
}
}
public class ThisDemo{
public static void main(String args[]){
    Student s1=new Student(4217,"mani",1000);
    s1.display();
    
}
}
