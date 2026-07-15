package Patterns;

public class Pattern4 {
    public void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern4 res = new Pattern4();
        int n = 5;
        res.pattern4(n);
    }
}

/*
1
22
333
4444
*/