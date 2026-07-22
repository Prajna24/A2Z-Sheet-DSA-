package Patterns;

public class Pattern10 {
    
    public void pattern10(int n){
        for (int row = 1; row < 2*n; row++) {
            int totColInRow = row <= n ? row : 2*n-row;
            for (int col = 0; col < totColInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Pattern10 res = new Pattern10();
        int n = 5;
        res.pattern10(n);
    }
}

/*
*
**
***
****
*****
****
***
**
*
*/