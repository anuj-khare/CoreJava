package DSA;

import java.util.HashSet;
import java.util.Set;

public class firstNonRepeating {
    public static void main(String[] args) {
        Set<Character> s = new HashSet<>();
        String s1 = new String("bBABnujAB");
        for(int i=0;i<s1.length();i++){
            char a = s1.charAt(i);
            if(s.contains(a)){
                System.out.println(a);
                return;
            }
            else{
                s.add(a);
            }
        }
    }
}
