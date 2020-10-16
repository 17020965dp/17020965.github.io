package Lesson2;

import java.util.Scanner;

public class IfStatement {
    public static void ClassA(int a){
        if(a>30 || a ==30){
            System.out.println("Hot day");
        }
        else if(a>20 && a<30){
            System.out.println("Nice day");
        }
        else {
            System.out.println("Cold day");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please import a :");
        int a = sc.nextInt();
        ClassA(a);
    }
}
