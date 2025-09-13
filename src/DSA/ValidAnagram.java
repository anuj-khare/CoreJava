package DSA;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        if(s1.length() != s2.length()){
            System.out.println("false");
            return;
        }
        Map<Character,Integer> m = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char characterAtI = s1.charAt(i);
            if(m.containsKey(characterAtI)){
                m.put(characterAtI,m.get(characterAtI)+1);
            }
            else{
                m.put(characterAtI,1);
            }
        }
        for (int i=0;i<s2.length();i++){
            char characterAtI = s2.charAt(i);
            if(m.get(characterAtI) != null){
                if(m.get(characterAtI) ==1){
                    m.remove(characterAtI);
                }
                else if(m.get(characterAtI) > 1){
                    m.put(characterAtI,m.get(characterAtI)-1);
                }
            }
        }
        String value = m.isEmpty() ? "Valid Anagram" : "Invalid Anagram";
        System.out.println(value);
    }
}
