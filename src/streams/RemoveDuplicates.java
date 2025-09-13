package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,1,11,22,33,11,22);
        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);

    }
}
