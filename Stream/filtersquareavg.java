package Stream;

import java.util.Arrays;
import java.util.List;


//sqaure of each and every number and filter is number is greater than 100 or not and then get the avg of it.
public class filtersquareavg {

    public static void main(String args[])
    {
        List<Integer> list = Arrays.asList(1,10,20,30,15);

        double st = list.stream().map(a->a*a).filter(n->n>=900).mapToInt(a->a).average().getAsDouble();
        System.out.println(st);
    }
}


