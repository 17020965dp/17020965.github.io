package Ktra;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String [] args){
        int n = 3;
        System.out.println(isHappy(n));
    }
    static public boolean isHappy(int n) {

        if(n==1){
            return true;
        }
        else if(n==4){
            return false;
        }

        int sum = n, tmp = 0;

        for(int i=0;i<n;i++) {
            tmp += (sum % 10) * (sum % 10);
            sum /= 10;
        }
        return isHappy(tmp);
    }
}
