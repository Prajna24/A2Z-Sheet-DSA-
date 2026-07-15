package Patterns;

public class Pattern3 {

    public void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern3 res = new Pattern3();
        int n = 5;
        res.pattern3(n);
    }
}

/*
1
1 2
1 2 3
1 2 3 4
*/