package section04.overflow;

public class Application01 {
    public static void main(String[] args) {

        // 자료형 별 최대 범위를 벗어나는 경우

        /*/*

        1byte 는 8개의 비트
        127 2진수 01111111
        -128 10000000
         */

        byte num1 = 127;
        System.out.println("num1 : " + num1);
        num1++;
        System.out.println("num1 : " + num1);


        //언더 플로우
        //오버 플로우와 반대되는 개념

        byte num2 = -128;
        System.out.println("num2 : " + num2);
        num2--;
        System.out.println("num2 : " + num2);


        int firstNum = 10000000;
        int secondNum = 700000;
        int multi = firstNum * secondNum;
        System.out.println( multi);

        long multi2 = (long)firstNum * secondNum;
        System.out.println(multi2);






    }
}
