package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","guava");
        List<String> mylist = list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
        System.out.println(mylist);
    }
}
