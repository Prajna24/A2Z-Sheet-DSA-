package Patterns;

public class Pattern6 {

    public void pattern6(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern6 res = new Pattern6();
        int n = 5;
        res.pattern6(n);
    }
}

/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/