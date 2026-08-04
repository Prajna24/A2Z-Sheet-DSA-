package Math;

import java.util.ArrayList;
import java.util.List;

public class All_Divisors {
    public List<Integer> findDivisors(int n){
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i*i <= n ; i++) {
            if(n%i == 0){
                res.add(i);
                if(i != n/i){
                    res.add(n/i);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        All_Divisors obj = new All_Divisors();
        int n = 36;
        List<Integer> res = obj.findDivisors(n);
        for(int val : res){
            System.out.print(val + " ");
        }
    }
}
/*
Input: N = 36
Output: [1, 2, 3, 4, 6, 9, 12, 18, 36]
Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.
 */