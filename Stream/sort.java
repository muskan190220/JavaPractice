package Stream;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class sort {
    public static void main(String args[])
    {

        //ascending
        List<Integer> ls = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);

        List<Integer> sortls = ls.stream().sorted().collect(Collectors.toList());

        System.out.println(sortls);

        //descending
        List<Integer> sortdesc = ls.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortdesc);



    } 
}
