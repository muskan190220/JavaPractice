package MethodPractice;

public class max{
static void MAXele(int A[], int key)
{
    int i;
    for(i=0; i<A.length; i++)
    {
        if(A[i] == key)
        //return i;
        System.out.println(i);
        
    }
        
}
public static void main(String args[]) 
{
    int A[] = {1,2,3,4,5,6,7,8,9,10}; 
    MAXele(A, 6);
    
}
}

