public class Array1 {
    public static void main(String args[])
    {
        //sum of the elements of the array
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        int sum = 0;
        for (int i = 0; i<A.length; i++)
        {
            sum = sum + A[i];
        }
        System.out.println("The sum of the elements is: "+sum);
        
     
        //Searching an element
        int B[] = {3,9,7,8,12,6,15,5,4,10};
        int count = 0;
        int m = 0;
        for(int j = 0; j<B.length; j++)
        {
            if (B[j] == 6)
            {
                count = count +1;
                m = j;
                break;
            }
        }
        //m = m+1; 
        if(count == 1)
        {
            System.out.println("Element found at the position: " +(m+1));
        }
        else
        {
            System.out.println("Element not found");

        }
        

        //Finding the largest element in the array
        int C[] = {3,9,7,8,12,6,15,5,4,10};
        int max = C[0];
        for(int x = 0; x<C.length; x++)
        {
            if (C[x]>max)
            {
                max = C[x];
            }
        }
        System.out.println("The largest element is: " +max);


        //Finding the second largest element
        int D[] = {3,9,7,8,13,6,15,5,4,10};
        int max1 = D[0];
        int max2 = D[0];
        for (int z = 0; z<D.length; z++)
        {
            if(D[z]>max1)
            {
                max2 = max1;
                max1 = D[z];
            }
            else if(D[z]>max2)
            {
                max2 = D[z];
            }
            
        }
        System.out.println("The largest element is: "+max1);
        System.out.println("The 2nd largest element is: "+max2);
    }   


}
