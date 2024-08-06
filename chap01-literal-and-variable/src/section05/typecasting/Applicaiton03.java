package section05.typecasting;

public class Applicaiton03 {
    public static void main(String[] args) {
        /*
         * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 계산
         * 다른 자료형끼리의 연산은 큰 자료형으로 자동 형벼노한 후 연산처리 된다;
         *
         *
         * */

        int inum = 10;
        long lnum = 10L;

        long result = inum + lnum;
        int result2 = (int)result;



        byte bnum =1;
        short snum = 2;

//        short result4 = bnum + snum;  두개 자료형이 더해질 때 대표자료형 int로바뀜.

        long lnum3 = 3L;
        long result5 = bnum + lnum3;
    }
}
