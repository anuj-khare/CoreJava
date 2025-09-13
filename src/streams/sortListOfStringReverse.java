package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortListOfStringReverse {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ram","Anuj","Ccc","Abcd");
        list = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list);
    }
}
