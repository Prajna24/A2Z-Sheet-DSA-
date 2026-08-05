package Recursion;

public class Print_N_to_1 {
    public void PrintNum(int n){
        if(n < 1)
            return;
        System.out.print(n + " ");
        PrintNum(n-1);
    }

    public static void main(String[] args) {
        Print_N_to_1 res = new Print_N_to_1();
        int n = 5;
        res.PrintNum(n);
    }
}
/*
Input: N = 4
Output: 4, 3, 2, 1
Explanation: All the numbers from 4 to 1 are printed.
*/