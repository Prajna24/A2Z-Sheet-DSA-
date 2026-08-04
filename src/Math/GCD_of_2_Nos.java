package Math;

public class GCD_of_2_Nos {
    public int findGCD(int n1, int n2){
        while(n1>0 && n2>0){
            if(n1>n2){
                n1 = n1%n2;
            }
            else{
                n2=n2%n1;
            }
        }
        if(n1==0)
            return n2;
        return n1;
    }
    public static void main(String[] args) {
        GCD_of_2_Nos res = new GCD_of_2_Nos();
        int n1 = 9, n2 = 12;
        System.out.println(res.findGCD(n1,n2));
    }
}

/*
Input: N1 = 9, N2 = 12
Output: 3

Explanation:
Factors of 9: 1, 3, 9
Factors of 12: 1, 2, 3, 4, 6, 12
Common Factors: 1, 3
Greatest common factor: 3 (GCD)
 */