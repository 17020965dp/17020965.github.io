package Lesson2;

import java.util.Scanner;

public class Quadratic {
    //TODO: Giải phương trình bậc 2: ax^2 + bx + c

    public static void A(double a,double b,double c){
        double delta = b*b - 4*a*c;
        if(delta <0){
            System.out.println("Phương trình vô nghiệm");
        }
        else if(delta == 0){
            System.out.println("Phương trình có nghiệm kép x =  " + (-b / (2*a)));
        }
        else {
            System.out.println("Phương trình có hai nghiệm x1 = " + (-b +(Math.sqrt(delta))/2) + " và x2 = " + (-b-(Math.sqrt(delta))/2)  );
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập a,b,c :");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        A(a,b,c);
    }
}
