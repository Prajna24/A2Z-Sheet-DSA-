package Patterns;

public class Pattern22 {

    public void pattern22(int n){
        for (int row = 0; row < 2*n-1; row++) {
            for (int col = 0; col < 2*n-1; col++) {
                int top = row;
                int bottom = (2*n-2)-row;
                int left = col;
                int right = (2*n-2)-col;

                int minDist = Math.min(Math.min(top,bottom), Math.min(left,right));
                System.out.print(n-minDist + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern22 res = new Pattern22();
        int n = 4;
        res.pattern22(n);
    }
}
/*
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
*/