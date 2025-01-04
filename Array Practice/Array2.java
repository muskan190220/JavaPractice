import java.util.*;
public class Array2 {
    public static void main(String args[])
    {
        //Left rotation of Array
        /* 
        int i; 
        int A[] = {5,9,6,10,12,7,3,5,4,2};
        int l =A[0];
        for(i = 1; i<A.length; i++)
        {
            A[i-1]=A[i];
            //System.out.println(A[i]);
        }
        A[A.length-1]=l;
        //System.out.println(l);
        for(int x:A)
        {
            System.out.println(x);
        }

        //Right Rotation of array
        int i; 
        int A[] = {5,9,6,10,12,7,3,5,4,2};
        int l =A[A.length];
        for(i=A.length; i>=0 ; i--)
        {
            A[i]=A[i-1];
            //System.out.println(A[i]);
        }
        A[0]=l;
        //System.out.println(l);
        for(int x:A)
        {
            System.out.println(x);
        }


        //Inserting an element in the array
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];
        int n = 6;
        for(int i = 0; i<n; i++)
        {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter a key number want to insert and at what position");
        int num = sc.nextInt();
        int z = sc.nextInt();

        for(int j = n; j>z; j-- )
        {
            A[j] = A[j-1];
        }
        A[z] = num;
        for(int x:A)
        {
            System.out.println(x);
        }
*/
        //Deletion of an element
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];
        int n = 6;
        for(int i = 0; i<n; i++)
        {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter a key number you want to delete");
        int num = sc.nextInt();
        //int z = sc.nextInt();

        for(int j = n; j>z; j-- )
        {
            A[j] = A[j-1];
        }
        A[z] = num;
        for(int x:A)
        {
            System.out.println(x);
        }
    }
}
