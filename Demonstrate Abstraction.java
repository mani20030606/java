import java.io.*;
abstract class Animal
{
    public abstract void  AnimalSound();
    public void Sleep()
    {
        System.out.println("zzzz");
    
    }
}
class Cow extends Animal
 {
    public void AnimalSound()
    {
        System.out.println("the cow somds maa");
    }
}
public class  AbstractDemo{
    public static void main(String args []){
        Cow c = new Cow();
        c.AnimalSound();
        c.Sleep();
    }
}
