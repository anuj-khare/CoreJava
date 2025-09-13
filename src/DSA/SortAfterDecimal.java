package DSA;

/*
78.4, 88.1, 56.88, 45.6, 88.7
Output
88.1, 78.4, 45.6, 88.7, 56.88
 */

import java.util.Arrays;
import java.util.List;

public class SortAfterDecimal {
    public static void main(String[] args) {
        List<Double> mylist = Arrays.asList(11.21,21.11,19.19,18.18);
        //mylist.stream().filter(x-> x >100).map(x->x*5).forEach(System.out::println);
        for(int i=0;i<mylist.size();i++){
            for(int j=0;j<mylist.size();j++){
                if(j+1 < mylist.size() && (mylist.get(j) - Math.floor(mylist.get(j)) > mylist.get(j+1) - Math.floor(mylist.get(j+1)))){
                    double temp = mylist.get(j);
                    mylist.set(j,mylist.get(j+1));
                    mylist.set(j+1,temp);
                }
            }
        }
        for(double element : mylist){
            System.out.println(element);
        }

    }
}

/*
Anagram TRUE:
LISTEN SILENT
TOP POT
AABBCC ABCABC

Anagram FALSE:
AABBCC ABBBCC


employee
id name deptid
P   A    11
S   D    33
Q   B    22
R   C    22

department
id name
11  AA
33  CC
22  BB

output
dName   empCount
CC           1
BB           2
AA           1

Select d.name , count(e.id)  from employees as e
join department as d
on d.id = e.deptid group by d.name ;

Singleton Class :


Singelton class Myclass {

    private Myclass myclass = null;

    public Myclass( ){
    if(myclass == null) {
    return new Myclass();
    }
    return myclass;
}

Hashmap : ClasObject as a key

hashcode and equals

e1 ( anuj,27,m)
e2 ( anuj,27,m)

Map<Employee,String> = ;

Map<Character,Integer>

Java 8

List<Integer> mylist // get all the elements greater than  100 and then multiply by 5

IOC and DI :

//1st step : redis dependendencies :
//2nd step : Configure defining the baens, taking care of connection
//3rd step : Redis bean : RedisTemplate : Spring's abstraction


mini-statements : last 50 mini transactions

Implemented Redis

spring-profiles:

application.yml

profile:
    dev:
    60-70 apis , try catch on every one of them...............
    @RestControllerAdvice
    @ExceptionHandler( Exception e) {
        new ResponseEntity<> (  , HTTP
    }
    Actuator : Not Aware
    Employee @OneToOne : Department
    @OneToMany : Lazy Loaded
    JOIN FETCH
    @Query(,native=true)
    findall
    Microservices :

    Gateway ,Service Registry ,

    a b c d e

    A -> /a

    Spring Reactive : Mono and Flux

    git pull , git fetch

 */
