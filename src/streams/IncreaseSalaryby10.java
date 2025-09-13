package streams;

import java.util.Arrays;
import java.util.List;

/*
Write a program to increase the salary by 10% whose salary is less than 20000 using
Stream API.
 */
import java.util.stream.*;
public class IncreaseSalaryby10 {
    public static void main(String[] args) {
        List<Integer> salary = Arrays.asList(20000, 10000, 24000, 30000);
        salary.stream().map(x->x + x*0.1).forEach(System.out::println);
    }
}
