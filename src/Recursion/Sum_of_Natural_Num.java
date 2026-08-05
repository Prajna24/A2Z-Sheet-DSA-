package Recursion;

import java.util.Scanner;

public class Sum_of_Natural_Num {
    public int SumofNum(int n){
        if(n == 1)
            return 1;
        return n + SumofNum(n-1);
    }
    public static void main(String[] args) {
        Sum_of_Natural_Num res = new Sum_of_Natural_Num();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(res.SumofNum(n));
    }
}
/*
Input: N=5
Output: 15
Explanation: 1+2+3+4+5=15
*/