package Patterns;

public class Pattern12 {

    public void pattern12(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            for (int space = 1; space <= (2*n)-(2*row) ; space++) {
                System.out.print(" ");
            }
            for (int col = row; col > 0; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern12 res = new Pattern12();
        int n = 4;
        res.pattern12(n);
    }
}

/*
1      1 -6sp
12    21 -4sp
123  321 -2sp
12344321 -0sp
*/
