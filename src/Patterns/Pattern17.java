package Patterns;

public class Pattern17 {
    public void pattern17(int n){
        for (int row = 0; row < n; row++) {

            for (int sp = 0; sp < n-row-1; sp++) {
                System.out.print(" ");
            }

            for (int col = 0; col <= row; col++) {
                System.out.print((char)('A'+col));
            }

            for (int col = 1; col <= row; col++) {
                System.out.print((char)('A'+row-col));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern17 res = new Pattern17();
        int n=5;
        res.pattern17(n);
    }
}
/*
   A
  ABA
 ABCBA
ABCDCBA
*/