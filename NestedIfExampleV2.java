import java.io.*;
import java.util.*;
  public class NestedIfExampleV2 extends Object
{
    public static void main(String args[])
    {
      int s1 = Integer.parseInt(args[0]);
      int s2 = Integer.parseInt(args[1]);
      int s3 = Integer.parseInt(args[2]);
      int total =s1+s2+s3;
      float avg = total/3.0f;
        System.out.println("total marks of the student"+total);
        if(avg > 75)
        {
            if(avg > 95 )
            {
            System.out.println("the average marks of the student "+avg+"the student in top 5");
            }
        else if (avg > 90)
        {
            System.out.println("the average marks of the student"+avg+"the student in top 10");
        }
        else if(avg > 85)
        {
            System.out.println("the average marks of the student"+avg+"the student in top 15");
        }
        else
        {
            System.out.println("the average marks of the student"+avg+"the student passed in first class");
        }
        }
        else if (avg > 60 && avg < 75)
        {
            System.out.println("the average marks of the student"+avg+"the student passed in second class");
        }
        else if (avg > 40 && avg < 60)
        {
            System.out.println("the average marks of the student"+avg+"the student passed third class");
        }
        else
        {
            System.out.println("the average marks of the student"+avg+"the student failed");
        }
      }
    
}
