package main.java.com.ohgiraffers.method;

public class Application07 {
    public static void main(String[] args) {
        /*
         *  static 매소드 호출
         *
         *  static 매소드를 호출하는 방법
         *  클래스명 , 매소드명();
         *
         * */
        System.out.println("10과 20의 합 : " + Application07.sumTNumbers(10, 20));

        Application07 app7 = new Application07();
        System.out.println(app7.sumTNumbers(10, 20));

        //동일한 클래스 내에 작성된 static매소드는 클래스명이 생략이 가능하다,
        System.out.println(sumTNumbers(10, 20));
    }




    public static int sumTNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
