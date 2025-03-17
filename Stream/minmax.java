package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class minmax {
    public static void main(String args[])
    {
        List<Integer> ls = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3,40);

        int max = ls.stream()
                    .max(Comparator.comparing(Integer::valueOf)).get();

            System.out.println(max);

        int min = ls.stream()
                    .min(Comparator.comparing(Integer::valueOf)).get();
            
            System.out.println(min);
            

}
}
