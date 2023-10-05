//java program to demonstrate DynamicMethodDispatchDemo
//05.10.2023
//mani 
//Csm
import java.io.*;
class A{
    void m1(){
        System.out.println("Inside a method M1");
    }
    }
    class B extends A{
        void m1(){
            System.out.println("Inside B method M1");
        }
    }
    class C extends A{
        void m1(){
            System.out.println("Inside c method M1");
        }
    }
    public class DynamicMethodDispatchDemo{
        public static void main(String args[]){
            A a=new A();
            B b=new B();
            C c=new C();
            A r;
            r=a;
            r.m1();
            r=b;
            r.m1();
            r=c;
            r.m1();
        }
    }
