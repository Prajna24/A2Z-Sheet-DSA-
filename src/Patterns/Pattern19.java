package Patterns;

public class Pattern19 {
    public void pattern19(int n){
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) {
                System.out.print("* ");
            }
            for (int sp = 1; sp <= 2*row; sp++) {
                System.out.print("  ");
            }
            for (int col = row; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = n-1; row >= 0; row--) {
            for (int col = row; col < n; col++) {
                System.out.print("* ");
            }
            for (int sp = 1; sp <= 2*row; sp++) {
                System.out.print("  ");
            }
            for (int col = row; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern19 res = new Pattern19();
        int n=3;
        res.pattern19(n);
    }
}
/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/