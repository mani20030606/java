class A {
    A (){
        System.out.println("inside defult constructor");
    }
  A (int x){
      this();
      System.out.println("inside parameterized constructor");
      System.out.println("x value is"+x);
  }
}
 public class ThisconstructorDemo{
    public static void main (String args[]){
        A a=new A(4201);
    }
}
