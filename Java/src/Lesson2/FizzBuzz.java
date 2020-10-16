package Lesson2;

import java.util.Scanner;

public class FizzBuzz {
    /**
     *  Enter a number
     *  If number % 5 == 0 --> Fizz
     *  If number % 3 == 0 --> Buzz
     *  If number % 5 && number % 3 --> FizzBuzz
     *  Else --> number
     *
     */

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your number :");
        int number = sc.nextInt();

        if(number % 3 == 0  &&  number % 5 ==0 ){
            System.out.println("FizzBuzz");
        }
        else if (number % 3 == 0){
            System.out.println("Buzz");
        }
        else if(number % 5 ==0){
            System.out.println("Fizz");
        }
        else {
            System.out.println(number);
        }

    }

}
