//java program to demonstrate Constructor
//07.09.2023
//ch.Mani saideep
//DefaultConstructorDemo
import java.io.*;
import java.util.*;
Public class Rectangle{
    int l,b,a;
    Rectangle (){
        //default constructor because there is nothing in the paranthesis
        l=5;
        b=6;
        a=l*b;
    }//constructor end
}//class end

public class DefaultConstructorDemo{
    public staic void main(String args[]){
        Rectangle R1= new rectangle();//it's a default constructor because there is nothing in the paranthesis.
        Rectangle R2= new rectangle();
        System.out.println("Area of the rectangle 1 is"+R1.a);
        System.out.println("Area of the rectangle 2 is"+R2.a);
        }
}
