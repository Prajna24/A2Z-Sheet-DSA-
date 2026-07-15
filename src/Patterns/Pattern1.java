package Patterns;

public class Pattern1 {

    public void pattern1(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern1 res = new Pattern1();
        int n = 5;
        res.pattern1(n);
    }
}
/* Pattern - 1
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
 */
