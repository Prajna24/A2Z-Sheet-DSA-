package Math;

import Math.Reverse_Digit;

public class Check_Palindrome {
    public static void main(String[] args) {
        Reverse_Digit res = new Reverse_Digit();
        int n = 4554;
        int revDigit = res.reverseDigit(n);
        System.out.println((n==revDigit)? "Palindrome Number" : "Not Palindrome");
    }
}
/*
Input:N = 4554
Output:Palindrome Number
Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number
 */