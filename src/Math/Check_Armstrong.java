package Math;

public class Check_Armstrong {
    public boolean checkArmstrong(int n){
        int res = 0, dup=n;
        while(n>0){
            res += (n%10)*(n%10)*(n%10);
            n/=10;
        }
        return res==dup;
    }
    public static void main(String[] args) {
        Check_Armstrong res = new Check_Armstrong();
        int n = 153;
        System.out.println(res.checkArmstrong(n));
    }
}
/*
Input:N = 153
Output:True
Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153
 */