package LoopsPractice;
import java.util.*;

public class Hackerrankpractice {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // Take inputs
        System.out.println("Enter the number of times the series should be printed:");
        int num = s.nextInt();

        System.out.println("Enter the values of a, b, and n:");
        int a = s.nextInt();
        int b = s.nextInt();
        int n = s.nextInt();
        
        s.close(); // Close scanner

        // Print the series for 'num' times
        //for (int i = 0; i < num; i++) {
            
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (1 << j) * b;  // (1 << j) is equivalent to 2^j * b
                System.out.print(sum + " ");  // Print sum at each step
            }
            System.out.println(); // New line after each series
        //}
    }
}