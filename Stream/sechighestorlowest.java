package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sechighestorlowest {
    public static void main(String args[])
    {
        List<Integer> ls = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3,32,40);
        //
        int max = ls.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println(max);

        int min = ls.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(min);

    }
}
