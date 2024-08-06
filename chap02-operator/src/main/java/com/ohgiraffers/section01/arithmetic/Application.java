package main.java.com.ohgiraffers.section01.arithmetic;

public class Application {
    public static void main(String[] args) {

        /*
        *
        * 산술 연산자
        * 산술 연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서
        * 가장 많이 사용됨.\
        *연산의 실행이 가능하기 위해 피요한 값, 변수가
        * 두 개인 이항 연산자로 분류되며
        * 피 연산자들의 연상 방향은 왼쪽에서 오른쪽.
        *
        * 산술 연산자의 종류
        * +
        * -
        * *
        * /
        * %
        *
        *
        * */

        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 =" +(num1 + num2));

//        System.out.println("num1 ==num2 =" + num1 -num2 );

        System.out.println("num1  * num2 =" +num1 * num2);
        System.out.println("num % num2 = " + num1 % num2);

    }

}
