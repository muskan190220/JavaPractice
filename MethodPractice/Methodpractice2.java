package MethodPractice;
public class Methodpractice2 {
    static void Update(int A[])
    {
        A[0] = 1;
    }
    public static void main(String args[])
    {
        int A[] = {0,2,3,4,5};
        Update(A);
        for(int i = 0; i<A.length; i++)
        {
            System.out.println(A[i]);
        }
        
    }
}
