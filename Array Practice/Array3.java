public class Array3 {
    public static void main(String args[])
    {
        int A[] = {1,2,3,4,5,6,7,8,9,10,0};
        int B[] = new int[11];
        /*for(int i=0; i<A.length; i++)
        {
            B[i] = A[i];
        }
        System.out.println("The element in Array B[] are: ");
        for(int x:B)
        {
            System.out.println(x);
        }
    } 
        */
    //Reverse copying an array
    for(int i=A.length,j=0;i>=0;i--, j++)
    {
        B[j] = A[i];
    }

    System.out.println("The element in Array B[] are: ");
        for(int x:B)
        {
            System.out.println(x);
        }

}
}
