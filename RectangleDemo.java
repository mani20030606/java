//calculate area and perimeter of a given rectangle
//7.9.23
//mani
import java.io.*;
  class RectangleCalc{
    int l=5;
    int b=10;
    int areaRect()
    {
        int a=l*b;
        return a;
    }
    int perirect(){
        int p=2*(l+b);
        return p;
    }
}
 public class RectangleDemo {
    public static void main (String args[]){
        RectangleCalc rc=new RectangleCalc();
        int area =rc.areaRect();
        int perimeter=rc.perirect();
        System.out.println("area of Rectangle"+area);
        System.out.println("perimeter of Rectangle is"+ perimeter);
    }
}
