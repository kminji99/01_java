package section03.constant;

public class Application01 {
    public static void main(String[] args) {

        /*
        *
        * 상수란?
        * 변수가 메모리에 변경될 값을 저장하기위한 공간을 나타내다면, 상수는 상반개념
        * 변하지 않는 고정값 저장해두기 위한 메모리 상의 공간을 상수라함.
        *
        * 상수 사용 목적
        * 1. 변경도지 않는 고정값 저장 목적.
        * 2. 초기화 이루 값 대입시 컴파일 에러 발생시켜 수정되지 못하도록
        *
        * 상수 사용방법
        * 1. 상수선언
        * 2. 값 초기화
        * 3. 필요한 위치 호출
        *
        * */
//        상수는 선언시에 final 키워드를 붙인다.
        final int AGE;


        AGE = 10;
       // AGE = 30; 변경불가
        System.out.println("AGE의 값 : " + AGE);

        System.out.println("AGE의 두배의 값 : " + (AGE * 2));

        int sum = AGE;  //변수에 대입가능
        sum += 10;


    }
}
