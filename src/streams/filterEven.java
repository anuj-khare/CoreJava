package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class filterEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,44,33,27,89,88,20);
        list = list.stream().filter(x-> x%2 ==0).collect(Collectors.toList());
        System.out.println(list);
    }
}
