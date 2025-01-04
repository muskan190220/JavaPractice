package LoopsPractice;
import java.util.*;
public class Loop2 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        /*System.out.println("Enter a number: ");
        int num = s.nextInt();
        int a;
        //int i = 1;
        System.out.println("The digits are:");
        while(num>0)
        {
            a = num%10;
            num = num/10;
            System.out.println(a);
        }

        //To count the digits of a number
        System.out.println("Enter a digit: ");
        int digit = s.nextInt();
        int b ;
        int count = 0;
        while(digit>0)
        {
            b = digit%10;
            digit = digit/10;
            count = count+1;
        }
        System.out.println("Count of the digits is: " +count);
        
        //Armstrong number or not
        System.out.println("Enter a digit: ");
        int dig = s.nextInt();
        int c;
        int m =dig;
        int sum = 0;
        while(dig>0)
        {
            c = dig%10;
            dig = dig/10;
            sum = sum+(c*c*c);
        }

        if(sum == m)
        {
            System.out.println("Number is Armstrong : "+sum);
        }
        else
        {
        System.out.println("Number is not armstrong " +sum);
        }
        
        //Reverse a number
        System.out.println("Enter a digit: ");
        int dig = s.nextInt();
        int c;
        int r = 0;
        
        int sum = 0;
        while(dig>0)
        {
            c = dig%10;
            dig = dig/10;
            r = r*10+c;
            //System.out.println(c);
        }
        System.out.println(r);
*/

        //TO check if Palindrome or not

        System.out.println("Enter a digit: ");
        int dig = s.nextInt();
        int c;
        int r = 0;
        int n = dig;
        
        while(dig>0)
        {
            c = dig%10;
            dig = dig/10;
            r = r*10+c;
            //System.out.println(c);
        }
        if (r == n )
        {
            System.out.println("Palindrome");
        }
        else{
        System.out.println("Not Palindrome");

        }


}
}