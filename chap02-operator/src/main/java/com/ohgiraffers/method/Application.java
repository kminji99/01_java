package main.java.com.ohgiraffers.method;

public class Application {
    public static void main(String[] args) {


        /*
        * 다른 클래스에 작성한 매소드 호출
        *
        *
        *
        * */

        // non-static 매소드의 경우
        //클래스가 다르더라도 사용하는 방법은 동일하다.
        calculator calculator = new calculator();
        int first = 100;
        int secoud = 50;
        int min = calculator.minNumberOf(first,secoud );
        System.out.println(min);

        // static 매소드의 경우
        // 다른 클래스에 작성한 static 매소드의 경우 호출할떄 반드시 클래스명을
        // 기술해야 한다.
        int max = calculator.maxNumberOf(first,secoud );}
}
