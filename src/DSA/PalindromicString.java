package DSA;

public class PalindromicString {
    public static void main(String[] args) {
        Boolean flag = true;
        String s1 = "AbccbA";
        int low =0;
        int high = s1.length()-1;
        while(low < high){
            if(s1.charAt(low) != s1.charAt(high)){
                flag = false;
                break;
            }
            low++;
            high--;
        }
        if(flag){
            System.out.println("Yep,Its a palindrome");
        }
        else{
            System.out.println("Nope,Not a palindrome");
        }
    }
}
