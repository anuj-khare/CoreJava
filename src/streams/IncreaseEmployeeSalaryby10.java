package streams;

import Domain.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IncreaseEmployeeSalaryby10 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("A", 25, 20000L),
                new Employee("B", 30, 30000L),
                new Employee("C", 28, 40000L));
        employees.stream().filter(x->x.getSalary() >=30000L).
                map(x->{
                    x.setSalary(x.getSalary()*2);
                    return x;
                }).map(x->x.getSalary()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
