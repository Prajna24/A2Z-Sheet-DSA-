package Recursion;

public class Print_Name_N_Times {

    public void PrintName(String name, int count, int n){
        if(count == n)
            return;
        System.out.println(name);
        PrintName(name, count+1, n);
    }
    public static void main(String[] args) {
        Print_Name_N_Times res = new Print_Name_N_Times();
        int n = 5;
        String name = "Dell";
        res.PrintName(name,0,n);
    }
}
/*
Input: N = 3
Output: Ashish Ashish Ashish
Explanation: Name is printed 3 times.
*/