package Patterns;

public class Pattern11 {

    public void pattern11(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print((row+col)%2 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern11 res = new Pattern11();
        int n = 5;
        res.pattern11(n);
    }
}

/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/