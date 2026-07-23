package Patterns;

public class Pattern16 {

    public void pattern16(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print((char)('A'+row));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern16 res = new Pattern16();
        int n = 5;
        res.pattern16(n);
    }
}
/*
A
BB
CCC
DDDD
EEEEE
*/