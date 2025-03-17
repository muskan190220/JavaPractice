package Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicate {
    public static void main(String args[])
    {
        List<Integer> ls = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);
        
        //Set<Integer> dup = ls.stream()
                           //  .filter(e->Collections.frequency(ls, e)>1)
                            // .collect(Collectors.toSet());
        //System.out.println(dup);

        //Using set
        Set<Integer> dupNum = new HashSet<Integer>();
        Set<Integer>dup = ls.stream().filter(e->!dupNum.add(e)).collect(Collectors.toSet());
        System.out.println(dup);

    }
}
