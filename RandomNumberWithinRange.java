/*Dhev
02-11-2023
java program to generate RandomNumberWithinRange*/
public class RandomNumberWithinRange
{  
public static void main( String args[] )   
{  
int min = 100;  
int max = 500;  
//Generate random double value from 200 to 400   
System.out.println("Random value of type double between "+min+" to "+max+ ":");  
double a = Math.random()*(max-min+1)+min;   
System.out.println(a);  
//Generate random int value from 200 to 400   
System.out.println("Random value of type int between "+min+" to "+max+ ":");  
int b = (int)(Math.random()*(max-min+1)+min);  
System.out.println(b);  
}  
}  
