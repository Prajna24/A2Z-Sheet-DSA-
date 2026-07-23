package Patterns;

public class Pattern13 {
    public void pattern13(int n){
        int val=1;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(val++ +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern13 res = new Pattern13();
        int n = 5;
        res.pattern13(n);
    }
}
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/
