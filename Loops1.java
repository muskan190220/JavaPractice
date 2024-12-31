package JavaPractice;
import java.util.*;
public class Loops1 {
    public static void main(String args[])
    { 
        //Multiplication Table
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for table: ");
        int num = sc.nextInt();
        int mul = 1;
        System.out.println("Table of " +num);
        for(int i=1; i<=10 ; i++)
        {
            mul = num*i;
            System.out.println(mul);
        }
        /* 
        //Sum of n numbers
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        for (int j = 1; j<=n ; j++)
        {
            sum = sum + j;
        }
        System.out.println("Sum of the numbers is: "+sum);
        
        //Factorial of a number
        System.out.println("Enter a number for factorial: ");
        int number = sc.nextInt();
        int fact = 1;
        for( int i = 1;i<=number; i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of the number is: " +fact);   */    
    }
}
