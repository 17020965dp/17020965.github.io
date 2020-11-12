package Ktra;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String [] args){
        int n = 19;
        System.out.println(isHappy(n));
    }
    static public boolean isHappy(int n) {

        if (n <= 4) return n == 1;

        int sum = n, tmp = 0;

        for(int i=0;i<n;i++) {
            tmp += (sum % 10) * (sum % 10);
            sum /= 10;
        }
        return isHappy(tmp);
    }
}
