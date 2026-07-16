package Patterns;

public class Pattern8 {

    public void pattern8(int n){

        for (int row = 0; row < n; row++) {

            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }

            int totColInRow = 2*n - (2*row+1);
            for (int col = 0; col < totColInRow; col++) {
                System.out.print("*");
            }

            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern8 res = new Pattern8();
        int n = 5;
        res.pattern8(n);
    }
}

/*
*********
 *******
  *****
   ***
    *
*/