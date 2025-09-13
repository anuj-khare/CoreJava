package streams;
import java.util.*;
import java.util.stream.Collectors;

public class SquareGreaterThan50 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,11,9,4,3,5);
        List<Integer> Mylist = list.stream().map(x->x*x).filter(x->x>50).collect(Collectors.toList());
        System.out.println(Mylist);
        System.out.println(list);
    }
}
