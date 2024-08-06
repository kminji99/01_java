package main.java.com.ohgiraffers.section03.increment;

import javax.lang.model.SourceVersion;

public class Application {
    public static void main(String[] args) {

        //증감 연산자
        // '++X', 'X++', : 앞 또는 뒤에 있는 피연산자값 1 증가
        // '--X', 'X--' : 앞 또는 뒤 피연산자 값 1만큼 뺌.

        int num = 10;
        int num2 = 20;
        int result = 0;


        result = result * num++; // num ++1
        System.out.println(result);
        System.out.println(num); //연산결과와 상관없이 1 증가시킴

        System.out.println("-----------------");

        result = 1;
        result = result * ++num;
        System.out.println(result);
        System.out.println(num); //연산결과와 상관없이 1 증가시킴

        result = 1;
        result = result * num++;
        System.out.println(result);
        System.out.println(num); //연산결과와 상관없이 1 증가시킴






    }
}
