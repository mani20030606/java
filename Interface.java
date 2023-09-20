//java to demonistrate interface
//14.09.2023
//Mani
//InterfaceDemo
import java.io.*;
interface Language
{
    void getName(String name);
}
class ProgrammingLanguage implements Language
{
   public void getName(String name)
    {
        System.out.println("my favorite programming language is "+name);
    }
}
 public class InterfaceDemo
{
    public static void main(String args[])
    {
        ProgrammingLanguage pl = new ProgrammingLanguage();
        pl.getName("java");
    }
}
