package Patterns;

public class Pattern18 {
    public void pattern18(int n){
        for (int row = n-1; row >= 0; row--) {
            for (int col = 0; col < n-row; col++) {
                System.out.print((char)('A'+row+col) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern18 res = new Pattern18();
        int n=5;
        res.pattern18(n);
    }
}
/*
E
D E
C D E
B C D E
A B C D E
*/