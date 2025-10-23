package DSA.SlidingWindow;

import java.util.Arrays;
import java.util.List;

public class MaxSubarraySumOfSize3 {
    public static int MaxSubArraySum(List<Integer> A){
        int i = 0;
        int j = 0;
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        while(j<3){
            sum += A.get(j);
            j++;
        }
        ans = Integer.max(ans,sum);
        while(j<A.size()){
            sum += A.get(j) - A.get(i);
            j++;
            i++;
            ans = Integer.max(ans,sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1,2,2,2,3,0);
        System.out.println(MaxSubArraySum(A));
    }
}
