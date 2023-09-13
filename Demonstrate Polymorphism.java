//java program to demonistrate polymorphism
//12-09-2023
//Mani
//PolymorphismDemo
import java.io.*;
class Animal
{
    public void AnimalSound()
    {
        System.out.println("an animal can make sounds");
    }
}
class Cow extends Animal
{
    public void AnimalSound()
    {
        System.out.println("a cow sounds maa");
    }
}
    class Cat extends Animal
    {
        public void AnimalSound()
        {
        System.out.println("a cat sound meo");
    }
}
public  class PolymorphismDemo
{
    public static void main(String args[])
    {
        Animal an = new Animal();
        Animal mycow = new Cow();
        Animal mycat = new Cat();
        an.AnimalSound();
        mycow.AnimalSound();
        mycat.AnimalSound();
    }
}

