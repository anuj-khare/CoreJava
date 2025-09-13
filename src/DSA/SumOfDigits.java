package DSA;

public class SumOfDigits {
    public static void main(String[] args) {
        /*
        Q2 Finding sum of digits of a number until sum becomes single digit
         */
        int digit = 243;
        if(digit < 10){
            System.out.println(digit);
            return;
        }
        int sum = 0;
        while(digit > 10){
            sum += digit%10;
            digit/= 10;
        }
        System.out.println(sum);
        return;
    }
}
