package Patterns;

public class Pattern20 {
    public void pattern20(int n){
        for (int row = 1; row < 2*n; row++) {
            int totRowInCol = (row <= n)? row : 2*n-row;
            for (int col = 1; col <= totRowInCol; col++) {
                System.out.print("*");
            }
            for (int space = 1; space <= 2*n - 2*totRowInCol; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totRowInCol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern20 res = new Pattern20();
        int n = 5;
        res.pattern20(n);
    }
}

/*
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*/