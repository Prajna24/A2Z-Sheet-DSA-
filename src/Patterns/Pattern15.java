package Patterns;

import java.security.PublicKey;

public class Pattern15 {

    public void pattern15(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print((char)('A'+col));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern15 res = new Pattern15();
        int n = 5;
        res.pattern15(n);
    }
}
/*
ABCDE
ABCD
ABC
AB
A
*/