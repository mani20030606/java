import java.io.*;
import java.util.*;
  public class NestedIfExampleV1 extends Object
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter first subject marks in integer");
        int s1 = sc.nextInt();
        System.out.println("enter second subject marks in integer");
        int s2 = sc.nextInt();
        System.out.println("enter third subject marks in integer");
        int s3 = sc.nextInt();
        int total = s1+s2+s3;
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
