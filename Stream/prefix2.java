package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class prefix2 {
    public static void main(String args[])
    {
        List<Integer> ls = Arrays.asList(2,222,232,567,890,236,2341,22);

        List<Integer> ls2 = ls.stream()
          .map(e->String.valueOf(e))//conversion of integer to string
          .filter(e->e.startsWith("2"))
          .map(Integer::valueOf)//Conversion of string to integer
          .collect(Collectors.toList());

          System.out.println(ls2);


    }
}
