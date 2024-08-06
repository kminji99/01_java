package section05.typecasting;

public class Application02 {
    public static void main(String[] args) {

        /*
        * 강제 형변환
        * 바꾸려는 자료형으로 캐스팅 연산자를 이용하여 형변환한다.
        *
        *
        * */

        /*
        *
        * 자동 형변환 규칙과 반대 상황에서 강제 형변환이 필여하다.
        * 1. 강제 형변환 규칙
        * 1-1. 큰 자료형에어서 작은 자료형으러 변경 시 강제 형벼노한 필요
        * 1-2. 실수를 정수로 변경시 강제
        * 1-3. 문자형을 int미만 크기 변수에 저장할때
        * 1-4. 논리형은 강제 형변환규칙에서 제외.
        * */

//        큰 자료형에서 작은 자료형
//        정수간의 강제 형변환
        long lnum = 8L;
        int inum = (int)lnum; //이래야 값이 들어가고 에러안남.\
        short snum = (short)inum;
        byte bnum = (byte)snum;
        System.out.println(bnum);


//        실수간 강제 형변환
        double dnum = 8.8;
        float fnum = (float)dnum;
        System.out.println(fnum);

//        실수를 정수로 변경시 강제 형변환 필여
        float fnum2 = 4.0f;
        long lnum2 = (long)fnum2; //해당방식 소수점은 내림.
        System.out.println(lnum2);

//        문자형  int 미만 크기의 변수에 저장할때 강제 형변환 필요.
        char ch = 'a';
        int inum2 = ch;
        byte bnum2 = (byte)ch; //int보다 작아서그럼.
        short snum2 = (short)ch;

//        정수를 문자에 대입 시 강제 형변환이 필요.
        char ch3;
        int inum5 = 100;
        ch3 = (char)inum5;
        System.out.println(ch3);

//        boolean은 제외된다.








    }
}
