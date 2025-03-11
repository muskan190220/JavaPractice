package CollectionFramework;
import java.util.ArrayList;
import java.util.List;


public class ArrayListdemo {
    public static void main(String args[])
    {
        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>(List.of(40,50,60));

        ar1.add(10);
        ar1.add(20);
        ar1.add(30);
        ar1.add(0,0);
        ar1.addAll(ar2);
        ar1.add(30);
        ar1.set(3,100);
        //System.out.println(ar1);
        //System.out.println(ar1.get(4));
        //System.out.println(ar1.indexOf(30));
        //System.out.println(ar1.lastIndexOf(30));

        //Normal for loop
        for(int i=0;i<ar1.size();i++)
        {
            System.out.println(ar1.get(i));
        }

        //ForEach loop
        for(var x:ar1)
        {
            System.out.println(x);
        }
    }
}
