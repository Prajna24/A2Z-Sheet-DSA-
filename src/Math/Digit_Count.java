package Math;

public class Digit_Count {
    public int countDigit(int n){
        int c=0;
        while(n>0){
            c+=1;
            n/=10;
        }
        return c;
    }
    public static void main(String[] args) {
        Digit_Count res = new Digit_Count();
        int n = 12345;
        System.out.println(res.countDigit(n));
    }
}

/*
N = 12345
O/P = 5
*/