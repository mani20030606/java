//java program to Demonstrate Parameterised construction
//07.09.2023
import java.io.*;
import java.util.*;
public class Rectangle{
    Rectangle(int l,int b){
    int a =l*b;
    }
}
public class ParametisedConstructorDemo{
    public static void main(String args[]){
        Rectangle R =new Rectangle  (6,10);
        System.out.println("Area of the rectangle is"+(R.a));
    }
}
