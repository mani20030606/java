//Java proram to illustrate how to declare,instanciate,initialize and traversing the java array
//16/10/2023
import java.io.*;
public class ArrayDemo1{
    public static void main (String args[]){
        int a[];
        a=new int [5];
        a[0]=11;
        a[1]=22;
        a[3]=33;
        a[4]=55;
        System.out.println("The array elements are");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
