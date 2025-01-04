package MethodPractice;

public class MethodOverloading2 {
    static void reverse(int A[])
    {
        for(int i=A.length-1; i>=0; i--)
        {
            System.out.println(A[i]);
        }
        //return 0;
    }
    static void reverse(int num)
    {
        int a;
        while(num>0)
        {
            a = num%10;
            num = num/10;
            System.out.print(a);
        }
    }
    static void reverse(String str)
    {
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(rev);
    }
    public static void main(String args[])
    {
        String str = "Hello!";
        int A[] = {1,2,3,4,5};
        int num = 123;
        //reverse(str);
        reverse(num);
        //reverse(A);

    }
}
