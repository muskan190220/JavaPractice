package Stream;


import java.util.*;


public class ex {
    public static void main(String args[])
    {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> map = ls.stream().filter(x->x%2==0).map(x->x*x).reduce((a,b)->a+b); 

        System.out.println(map.get());
               
    }
}
