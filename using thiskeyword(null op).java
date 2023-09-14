//java program to dmonstrate the importance of this keyword
//14.09.2023
import java.io.*;
class Student{
    int rollnumber;
    String name;
    float fee;
    Student (int rollnumber,String name,float fee)
    {
        rollnumber=rollnumber;
        name=name;
        fee=fee;
        
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
