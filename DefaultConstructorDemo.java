//java program to demonstrate Constructor
//07.09.2023
//ch.Mani saideep
//DefaultConstructorDemo
import java.io.*;
import java.util.*;
class Rectangle {
    int l,b,a;
    Rectangle (){
        //default constructor because there is nothing in the paranthesis
        l=5;
        b=6;
        a=l*b;
    }//constructor end
}//class end

class DefaultConstructorDemo {
    public static void main(String args[]){
        Rectangle r1= new Rectangle();//it's a default constructor because there is nothing in the paranthesis.
        Rectangle r2= new Rectangle();
        System.out.println("Area of the rectangle 1 is"+r1.a);
        System.out.println("Area of the rectangle 2 is"+r2.a);
    }
}
