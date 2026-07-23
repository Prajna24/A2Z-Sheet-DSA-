package Patterns;

public class Pattern14 {
    public void pattern14(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row ; col++) {
                System.out.print((char)('A'+col));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern14 res = new Pattern14();
        int n = 5;
        res.pattern14(n);
    }
}
/*
A
AB
ABC
ABCD
ABCDE
*/
