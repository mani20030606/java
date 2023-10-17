import java.util.Scanner;

public class ArrayElementsSum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " values into the array");
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }

        System.out.println("Sum of the given elements is " + sum);
    }
}
