package ConditionalStatement;
import java.util.*;
public class ConditionalStatement3 {
    public static void main(String args[])
    {
        System.out.println("Enter your choice: ADD, SUB, MUL or DIV");
        Scanner sc = new Scanner(System.in);
        String option = sc.next();
        int a,b,c;
        System.out.println("Enter 2 numbers:");
        a = sc.nextInt();
        b = sc.nextInt();


        switch(option)
        {
            case "ADD": 
            c = a+b;
            System.out.println("The addition of 2 numbers is: " +c);
            break;

            case "SUB": 
            c = a-b;
            System.out.println("The subtraction of 2 numbers is: " +c);
            break;

            case "MUL":
            c = a*b;
            System.out.println("The multiplication of 2 numbers is: " +c);
            break;

            case "DIV":
            c = a/b;
            System.out.println("The division of 2 numbers is: " +c);
            break;


            default: System.out.println("Invalid choice");
            break;
        }

    }
}
