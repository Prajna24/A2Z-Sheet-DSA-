package Patterns;

public class Pattern5 {

    public void pattern5(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern5 res = new Pattern5();
        int n = 5;
        res.pattern5(n);
    }
}

/*
* * * * *
* * * *
* * *
* *
*
*/