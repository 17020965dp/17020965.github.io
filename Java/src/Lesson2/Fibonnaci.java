package Lesson2;

import java.util.Scanner;

public class Fibonnaci {
    public static int FibonnaciExam(int n){
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return FibonnaciExam(n - 1) + FibonnaciExam(n - 2);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(FibonnaciExam(i));
        }
    }
}
