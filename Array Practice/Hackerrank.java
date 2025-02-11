import java.util.Scanner;

public class Hackerrank {
    public void Reversearray()
    {
        Scanner s = new Scanner(System.in);
        //System.out.println("Enter the size of the array");
        int size = s.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        for(int i = 0; i<size; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i=a.length-1,j=0;i>=0;i--, j++)
        {
            b[j] = a[i];
        }

        for(int x:b)
        {
            System.out.println(x);
        }
    }

    public static void main(String args[])
    {
        Hackerrank h = new Hackerrank();
        h.Reversearray();
    }
}
