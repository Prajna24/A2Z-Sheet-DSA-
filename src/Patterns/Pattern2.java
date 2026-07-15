package Patterns;

public class Pattern2 {

    public void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern2 res = new Pattern2();
        int n = 5;
        res.pattern2(n);
    }
}

/*
*
* *
* * *
* * * *
* * * * *
 */