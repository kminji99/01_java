package main.java.com.ohgiraffers.section02.assignment;

import javax.lang.model.SourceVersion;

public class Application {
    public static void main(String[] args) {

        /*
        * 대입 연산자와 산술 복합 대입 연산자.
        *
        * '=' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 대입한다.
        * '+=' : 왼쪽의 피 연산자에 오른쪽 피연산자 더한 결과대입
        * '-=' : 왼쪽에 오른 피연산자 뺀
        * '*='
        * '/='
        * '%='
        *
        *
        *
        *
        * */


        int num = 12;

        System.out.println("num = " +num);

        //증가
        num += 3;
        System.out.println("num = " +num);

        //5로 나눈 나머지값
        num %= 5;
        System.out.println("num = " +num);

        num = 12;
//        num = num * 4.1;


        num *= 4.1;
        System.out.println("num = " +num);







    }
}
