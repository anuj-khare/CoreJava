package streams;

import Domain.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSalarySorting {


    public static void main(String[] args) {
        List<Employee> mylist = Arrays.asList(
                new Employee("Anuj",28,20000L,"Math"),
                new Employee("Garima",25,18000L,"Arts"),
                new Employee("Anupt",28,17000L,"Math"),
                new Employee("Prakash",28,16000L,"Biology")
        );
        //Task 1 : Sort employees based on salary
        mylist.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).forEach(System.out::println);
        //Task 2 : Group employees based on department
        System.out.println("Now Mapping employees department wise ");
        Map<String,List<Employee>> departmentMap = mylist.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        for(Map.Entry entry : departmentMap.entrySet()){
            System.out.println(" Department : "+ entry.getKey() + "==>" + entry.getValue());
        }
        //Task 3 : Group department wise employees
        Map<String,Long> departmentCountMap = mylist.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        for(Map.Entry entry : departmentCountMap.entrySet()){
            System.out.println("Department : " + entry.getKey() + " ,Count : "+ entry.getValue());
        }
    }
}
