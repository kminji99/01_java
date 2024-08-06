package section02.variable;

public class Application02 {
    public static void main(String[] args) {

        System.out.println("----------");
//        목차 1-1 숫자를 취급하는 자료형
//        1byte 는 8개의 bite가 모여진 데이터딘으;
//        자바는 기본적으로 데이터의 최소단위를 1byte 취급

//        정수형
        byte bnum; //1byte
        short snum; // 2byte
        int inum; // 4byte
        long lnum;// 8

//        실수형
        float fnum;
        double dnum; //8byte

//        목차 1-2문자를 취급하는 자료형
        char ch; //2byte
        System.out.println((char) 97);

//        목차 103 논리값을 취급하는 자료형
        boolean isTrue; //1byte

        String str;//기본아님-참조자료형


        System.out.println("---------변수 초기화---");

        /*
        * 목차 2 변수에 값을 대입하기
        * 위에서 한 변수 선언은 메모리에 값을 저장하기 위해
        * 공간만 생성해 둔 상태이다.
        * 그 공간에 대입 연산자를 이용 자료형에 저장하기로 한
        * 형태의 값 저장
        * 만약, 약속 내용과 다른 형태 대입
        * 컴파일러 에러
        *
        * int num = 1;
        * */

//        정수 취급 자료형
        bnum = 1;
        snum = 2;
        inum = 3;
        lnum = 8L; //long 타입은 뒤에 L명시
        System.out.println(lnum);


//        실수를 취급하는 자료형애 값 대입
        fnum = 4.0f; //끝에 f를 꼭 붙여야 사용가능
        dnum = 4.0;

//        문자를 취급하는 자료형에 값 대입
        ch = 'a';
        char ch2 = 97;
        System.out.println(ch2);


//         논리형을 취급하는 자료형의 값 대입
        isTrue = true;
        System.out.println(isTrue);
        isTrue = false;
        System.out.println(isTrue);

//        문자열을 취급하는 자료형에 값 대입
        str = "안녕하세요";


        /*
        *
        * 숫자로 된 형태의 값을 그대로 사용하는 자료형은
        * byte, short, int, double 이다
        * 일반적으로 사용하는 값을 독특한 형태가 아닌 일반적인
        * 형태로 사용할 수 있는 자료형을 대표자료형이라 하며
        * 정수는 int, 실수는 double 이 대표 자료형이다.
        *
        *
        * */

        System.out.println("bnum의 값:"+ bnum);

//        변수를 이용해서 연산하기

        int point = 100;
        int bonus = 10;

//         변수에 저장된 값을 이용해 연산할 수 있다.
        System.out.println("포인트와 보너스의 합은 : "+ (point + bonus));
        point += 100;
        System.out.println("새로운 포인트는 : "+ (point + bonus));


    }
    /*
    * 변수를 선언하고 갑을 할당하여 사용할 수 있다.
    *
    * 변수를 사용하는 방법
    * 1. 변수를 준비한다
    * 2. 변수에 값을 대입 -초기화
    * 3. 변수를 사용한다.
    *
    *
    * */

    /*
    * 변수에는 자료형이 존재한다.
    * 자료형이란? 디양한 값의 형태별로 어느 정도의 큿기를
    * 하나의 값으로 취급할 것인지 미리 컴파일러와 약속한 키워드이다.
    * 얘) 앞에서 사용한 int 자료형은 4byte 만큼으 읽어서
    * 하나의 값으로 취급하겠다는 약속
    * 이러한 자료형은 기본자료형, 참조,나누어진다.
    * 그중 기본자료형 8가지
    * 프리미티브 타입
    * */


}
