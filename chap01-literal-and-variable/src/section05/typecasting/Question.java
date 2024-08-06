package section05.typecasting;

public class Question {
    public static void main(String[] args) {



        /*
        *
        *
        *
        * 5명의 반 학생이 있으면 키는 각각
        * 178.5 / 170.3 / 190.7 / 188.67 / 160.8 이다.
        * 학생 키 평균 후 화변에 보여라.
        * 소수자리는 절삭한다.
        *
        *
        * */

        int average = (int)(178.5 + 170.3 + 190.7 + 188.67 + 160.8)/5;
                System.out.println("5명의 평균키 : " + average);


        long lnum = 10L;
        int num = 190;


        System.out.println("----------------");

        /*
        * \
        * 사업을 시작한 홍길동은 이번 달 매출에서 부가세 10% 를 제외한 소득 알고싶음.
        * 매출은 다음과 같다.
        * 150400 원
        * 1400원
        * 25000원
        * 30000원
        *
        * 다음 출력.
        * 홍길동의 총 매출액은 --원입니다.
        * 부가세 제외 소득은 --원이고 부가세는 --원입니다.
        * \
        *
        * */
        float sum = 150400 + 1400 + 25000 + 30000;
        float tax = (float)((150400 + 1400 + 25000 + 30000)*0.1);
        System.out.println("홍길동의 총 매출액은 "+sum + "원입니다.");
        System.out.println("부가세 제외 소득은 " + 0.9*sum +"원이고 부가세는 " + tax + "원입니다.");


        /*
        *
        * 
        * */
    }
}
