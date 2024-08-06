package section01.literal;

public class Application02 {
    public static void main(String[] args) {

        //정수 리터럴 연산 형태의 값을 연산한다.

        /*
        *
        * 123+123
       *  10%2
       * 40/10
       *
         */
       System.out.println(123 + 123);
       System.out.println(10%3);
       System.out.println(123*456);
       System.out.println(134 - 47);
       System.out.println(12 + 47);
       // 실수와 정수연산
        System.out.println("------");
        System.out.println(1 + 0.5);
        System.out.println(1%0.5);
        System.out.println(1/0.5);
                System.out.println(1 - 0.5);
                System.out.println(1 % 0.3);

        System.out.println("----------");
        //문자와 문자의 연산
        //컴퓨터는 문자를 인식하지 못하기 때문에 대응되는 숫자들이 있다
        //아스키코드 영어, 유니코드 전세계언어
        System.out.println('a'+'b');
        System.out.println('ㄱ'+'ㄴ');

        //문자열은 + 연산만 가능하다
        //데이터 값이 다를 때는 자동 형변환을 통해 최상위 타입으로 변경된다.
        // (문자열이 최상위 타입)

        System.out.println("---------문자 열과 다른 형태의 값 연산------");
        System.out.println("ddel"+true);
        System.out.println("hell0"+(123+456) + "java");
        //논리값 연산

        //System.out.println(true + 1); 불가능
        //System.out.println(true + false); 불가능
        System.out.println(true + "false");
//        안녕 한줄주석
        /*
        *

        * */

        /*
        * */


    }
}
