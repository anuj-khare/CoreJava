package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class firstNonEmpty {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("","","","ram","anuj","","manju","ghosh");
        Optional<String> s  = list.stream().filter(x->x.length() != 0).findFirst();
        if(s.isEmpty()){
            System.out.println("Empty");
            return;
        }
        System.out.println(s.get());
    }
}
