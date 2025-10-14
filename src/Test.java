/*
--------------------

1. Task Description: Subset Sum FinderProblem Statement:Given an array of positive integers and a target sum, find all subsets of elements that sum up to the given target.

Each number in the array may be used at most once in a subset.Input Format:An integer n – the number of elements in the array.

A line with n space-separated integers – the array elements.

An integer target – the required sum.Output

Print all subsets (each on a new line) whose sum is exactly equal to target.

Each subset should be printed as space-separated integers.Example  :

6

20 10 5 16 9 3

35Explanation:

From the array: [20, 10, 5, 16, 9, 3], one valid subset is [5, 10, 20] which sums to 35. The program should print all such possible combinations.

 */


import Domain.FinTech;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Long id,String Symbol,Double prize,String date){

public class Test{
    public static void main(String[] args) {
        List<FinTech> list = Arrays.asList(new FinTech(11L,"AAPL",1283.0,"12-08-1997"),
                new FinTech(1L,"AAPL",281.3,"12-08-1997"),
                new FinTech(2L,"TSLA",283.1,"12-08-1997"),
                new FinTech(3L,"IBM",283.0,"12-08-1997"),
                new FinTech(4L,"AAPL",2813.4,"12-08-1997"));

        Map<String,List<FinTech>> map =
                list.parallelStream().collect(Collectors.groupingBy(FinTech::getSymbol));
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
