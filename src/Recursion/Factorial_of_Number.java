package Recursion;

public class Factorial_of_Number {
    public int factorial(int n){
        if(n == 0)
            return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Factorial_of_Number res = new Factorial_of_Number();
        int n =5;
        System.out.println(res.factorial(n));
    }
}
/*
Input: X = 5
Output: 120
Explanation: 5! = 5*4*3*2*1
 */