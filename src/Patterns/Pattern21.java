package Patterns;

public class Pattern21 {
    public void pattern21(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print((row==0 || col==0 || row==n-1 || col==n-1)? "*":" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Pattern21 res = new Pattern21();
        int n = 5;
        res.pattern21(n);
    }
}

/*
****
*  *
*  *
****
*/