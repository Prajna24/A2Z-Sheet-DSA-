package Recursion;

public class Print_1_to_N {
    public void PrintNum(int cur, int n){
        if(cur > n)
            return;
        System.out.print(cur + " ");
        PrintNum(cur+1,n);
    }
    public static void main(String[] args) {
        Print_1_to_N res = new Print_1_to_N();
        int n = 5;
        res.PrintNum(1,n);
    }
}
/*
Input: N = 4
Output: 1, 2, 3, 4
Explanation: All the numbers from 1 to 4 are printed.
*/