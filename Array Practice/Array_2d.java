public class Array_2d {
    public static void main(String args[])
    {
        /*int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int B[][] = {{7,8,9},{4,5,6},{1,2,3}};
        int C[][] = new int[3][3];

        //Adding 2 matrix
        for(int i = 0; i<A.length; i++)
        {
            for(int j = 0; j<B.length; j++)
            {
                C[i][j] = A[i][j]+B[i][j];
                System.out.println(C[i][j]);
            }
            System.out.println(" ");
        }

        //Multiplying 2 matrix
        for(int i = 0; i<A.length; i++)
        {
            for(int j = 0; j<B.length; j++)
            {
                C[i][j] = A[i][j]*B[i][j];
                System.out.println(C[i][j]);
            }
            System.out.println(" ");
        }

        //Sorting the array of string
        String arr[] = {"java", "python", "basic", "ada", "smalltalk", "pascal"};
        java.util.Arrays.sort(arr);

        for(String x: arr)
        {
            System.out.println(x);
        }

    }
*/
    //Pattern 1
    for(int i = 0; i<=5; i++)
    {
        for(int j=0; j<i; j++)
        {
            System.out.print("* ");
        }
        System.out.println(" ");
    }

    //Pattern 2}
    for(int i = 0; i<6; i++)
    {
        for(int j=6; j>0; j--)
        {
            System.out.print("* ");
        }
        System.out.println(" ");
    }

}
}

