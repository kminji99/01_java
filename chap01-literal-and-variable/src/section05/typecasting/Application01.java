package section05.typecasting;

public class Application01 {
    public static void main(String[] args) {




        /*
        * 데이터 형 변환
        * 데이터 형ㅇ 변환이 필요한 이유
        * -자바에서 다른 타입 끼리의 연산은 피 연산자들이 모두 같은 타입이 되어야 실행.
        * -즉, 같은 데이터 타입 끼리만 연산
        *
        *
        * 형변환의 종류와 규칙
        * 1. 자동 형변환(묵시적) : 컴파일러가 자동
        * 1-1. 작은 자료형에서 큰 자료형을 자동 형변환된다.
        * 1-2. 정수는 실수로 자동 형변환.
        * 1-3. 문자형은 int 형으로 자동 형변환.
        * 1-4. 논리형은 제외됨.
        * 2. 강제 형변환 (명시적 형변환) : 형변환 cast 연산자 이용
        * 2-1. 자동형변환이 적용되지 않는경우필요
        *
        * */
        //작은 자료형에서 큰 자료형으로 자동 형변환
        //데이터 손실이 발생 않을 때 컴파일러 자동처리.

        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

//        연산 시에도 자동으로 큰 쪽으로 형변환되어 계산된다.
        int num1 = 10;
        long num2 = 20L;

        long result = num1 + num2;
        System.out.println("result :" + result);
//        int result = num1*num2 불가

//         정수는 실수로 자동 형변환된다.
//        정수를 실수로 변경할 때 소수점 자리가 없어도 실수형태로 표현가능.
//        데이터 손실이 없기 때문에 자동 형변환가능.
        long eight = 8L;
        float four = eight;
        System.out.println("four :" + four);

        float result3 = eight * four;
        System.out.println("result3 :" + result3);

        char ch1 = 'a';
        int charNumber = 97;

        char chValue = (char) charNumber;
        System.out.println((int)ch1);
        System.out.println(chValue);
        System.out.println((char)charNumber);

        char ch2 = 65;
        System.out.println("ch2 : "+ ch2);

//        논리형은 규칙에서 제외
//        boolean isTrue = false;
//        byte b = isTrue;
//        String test = isTrue;
//        int i = isTrue;




    }
}
