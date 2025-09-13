package DSA;

public class StringReverse {
    //Note : you cannot use normal strings because normal string is immutable,i.e.,
    //you cannot change the internal string.
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("techno");
        int low = 0;
        int high = s1.length()-1;
        while(low < high){
            char temp = s1.charAt(low);
            s1.setCharAt(low,s1.charAt(high));
            s1.setCharAt(high,temp);
            low++;
            high--;
        }
        System.out.println(s1);
    }
}
