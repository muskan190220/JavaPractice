package Stream;

import java.util.Arrays;
import java.util.List;



public class getignore {
    public static void main(String args[])
    {
        List<Integer> ls = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);

        int sum = ls.stream().limit(5).reduce((a,b)->a+b).get();

        System.out.println(sum);

        int suum = ls.stream().skip(5).reduce((a,b)->a+b).get();
        System.out.println(suum);



    }
}
