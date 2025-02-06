package ExceptionHandling;

import java.util.Scanner;


public class Exceptions2 {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in); 
        int a, b, c;
        try {
            System.out.print("Enter value for a: ");
            a = sc.nextInt();
            System.out.print("Enter value for b: ");
            b = sc.nextInt();
            
            c = a / b;  // This line will throw ArithmeticException if b = 
            System.out.println("Result: " + c);
           
        }
        catch(ArithmeticException e)
        {
            System.out.println("Demonitor cannot be 0, try again");
        }
    }
}
