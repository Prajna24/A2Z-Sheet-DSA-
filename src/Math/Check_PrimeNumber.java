package Math;

public class Check_PrimeNumber {
    public boolean checkPrime(int n){
        int cnt=0;
        for (int i = 1; i*i <= n; i++) {
            if(n%i==0){
                cnt+=1;
                if(i != n/i){
                    cnt+=1;
                }
                if(cnt > 2)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Check_PrimeNumber obj = new Check_PrimeNumber();
        int n = 7;
        System.out.print((obj.checkPrime(n))? "Not a Prime Number" : "Prime Number");
    }

}
/*
Input:N = 2
Output:True

Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
 */