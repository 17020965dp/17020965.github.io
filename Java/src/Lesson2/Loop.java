package Lesson2;

public class Loop {
    /**
     *  Viết chương trình in ra màn hình các số chia hết cho 9 trong khoảng 200-500
     *
     */

    public static void main(String [] args){
        System.out.print("Các số chia hết cho 9 từ 200 đến 500 là : ");
        for (int i =200;i<500 ; i++){
            if(i%9==0){
                System.out.print(i + " ");
            }
        }
    }
}
