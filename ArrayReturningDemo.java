// ArrayReturningDemo.java
//17/10/2023
import java.io.*;

public class ArrayReturningDemo {
    static int[] max() {
        return new int[]{10, 60, 40, 50, 70};
    }

    public static void main(String args[]) {
        int arr[] = max();
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) { // Note the correct spelling of "length" here
            if (m < arr[i]) {
                m = arr[i];
            }
        }
        System.out.println("The maximum element of the array is: " + m);
    }
}
