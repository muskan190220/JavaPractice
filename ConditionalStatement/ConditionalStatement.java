package ConditionalStatement;

import java.util.*;
public class ConditionalStatement {
    public static void main(String args[])
    {
        //Odd or Even
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        if(a%2 == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }

        //Person yound or not
        int age;
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        if(age>=18 && age<=30)
        {
            System.out.println("You are young");
        }
        else if(age>30)
        {
            System.out.println("You are not young");
        }
        else
        {
            System.out.println("You are a kid");
        }
    }
}
