package Math;

public class Reverse_Digit {
    public int reverseDigit(int n){
        int revdigit = 0;
        while(n>0){
            revdigit = revdigit * 10 + n%10;
            n/=10;
        }
        return revdigit;
    }
    public static void main(String[] args) {
        Reverse_Digit res = new Reverse_Digit();
        int n = 12345;
        System.out.println(res.reverseDigit(n));
    }
}
/*
N = 12345
O/P = 54321
 */