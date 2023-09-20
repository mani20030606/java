//java to demonistrate this constructer demo
//14.09.2023
//Mani
//MethodOverRaidingDemo
import java.io.*;
class Bank
{
    int getRateOfIntrest()
    {
        return 0;
    }
}
class SBI extends Bank
{
    int getRateOfIntrest()
   {
       return 7;
   }
}
class HDFC extends Bank
{
    int getRateOfIntrest()
    {
        return 9;
    }
}
class UnionBank extends Bank
{
    int getRateOfIntrest()
    {
        return 10;
    }
}
public class OverRaidingDemo
{
    public static void main(String args[])
    {
        SBI s = new SBI();
        HDFC h = new HDFC();
        UnionBank u = new UnionBank();
        System.out.println(" sbi rate of interset is"+s. getRateOfIntrest());
        System.out.println(" hdfc rate of intrest is"+h.getRateOfIntrest());
        System.out.println("union bank rate of interset is"+ u.getRateOfIntrest());
    }
}
