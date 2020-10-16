package Lesson2;

import java.util.Scanner;

public class While {
    /**
     * Viết chương trình nhập 2 số nguyên a, b từ bàn phím, in ra tất cả các số chia hết cho 3 từ a đến b
     */

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a và b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = a;
        System.out.print("Các số chia hết cho 3 từ a đến b : ");
        while (i<b){
            if(i % 3 ==0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
