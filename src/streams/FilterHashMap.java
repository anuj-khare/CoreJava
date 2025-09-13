package streams;

/*
Write a program to Find all those student/course pairs in HashMap where
Course=Course_1 using java8
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterHashMap {
    public static void main(String[] args) {
        Map<String,String> coursesmap = new HashMap<>();
        coursesmap.put("Sagar","Course1");
        coursesmap.put("Sameer","Course21");
        coursesmap.put("Rajan","Course2");
        coursesmap.put("Venkat","Course1");
        coursesmap.put("Raina","Course2");
        List<String> list = coursesmap.entrySet().stream().filter(x->x.getValue()=="Course1").map(x->x.getKey()).collect(Collectors.toList());
        System.out.println(list);
    }
}
