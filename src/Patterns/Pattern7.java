package Patterns;

public class Pattern7 {

    public void pattern7(int n){
        for (int row = 1; row <= n; row++) {

            int spaces = n-row;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            int totColInRow = 2 * row;
            for (int col = 1; col < totColInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern7 res = new Pattern7();
        int n=5;
        res.pattern7(n);
    }
}

/*
    *
   ***
  *****
 *******
*********
*/