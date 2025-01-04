
package MethodPractice;
import java.util.*;
public class GCD {
    static int gcd(int m, int n)
    {
        while(m!=n)
        {
            if(m>n)
            {
                m = m-n;
            }
            else
            {
                n = n-m;
            }
        }
        return m;

    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(gcd(m,n));
        
    }
}
