package DSA;

import Domain.Employee;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
First non repeating element in a string
 */
public class TestBed {
    public static void main(String[] args) {
        String s1 = "SaAbcdbh";
        Set<Character> characterSet = new HashSet<>();
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(characterSet.contains(ch)){
                System.out.println(ch);
                break;
            }
            characterSet.add(ch);
        }
    }
}


