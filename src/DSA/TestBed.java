package DSA;

import java.util.HashMap;
import java.util.Map;

public class TestBed {

    public static boolean checkAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        Map<Character,Integer> m = new HashMap<>();
        //filled map here
        for(int i=0;i<s1.length();i++){
            char character = s1.charAt(i);
            if(m.containsKey(character)){
                m.put(character,m.get(character)+1);
            }
            else{
                m.put(character,1);
            }
        }
        //now cut the map
        for(int i=0;i<s2.length();i++){
            char character = s2.charAt(i);
            if(m.containsKey(character) == false){
                return false;
            }
            else{
                //EXIST TOH KARTA HAI
                if(m.get(character) == 1){
                    m.remove(character);
                }
                else{
                    m.put(character,m.get(character)-1);
                }
            }
        }
        return m.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = new String("tits");
        String s2 = new String("silt");
        if(checkAnagram(s1,s2)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
