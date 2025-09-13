package streams;

import java.util.Arrays;
import java.util.List;

public class countStringsHavingLengthGreaterThan3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("raman","aman","rajesh","g","a");
        long n = list.stream().filter(x->x.length()>3).count();
        System.out.println(n);
    }
}
