package section02.variable;

public class Question {
    public static void main(String[] args) {
        /*\
        * 김경리가 4명의 직원의 월급을 입금해줘야 하는 날이다.
        * 각각 직책은 대리/과장/차장/부장이며
        * 대리는 100만언, 과장은 120만원, 차장은 130만원, 부장은 150만원월급.
        * 보넛너스는 각 월급*0.5 .
        *
        * 화명에 다음 출력
        * ex) 김대리의 월급은 100만원 + 보너스 50만원으로 총 150만원 입금되었습니다.
        *
        * 4명다
        *
        *
        *
        * */

        int monthlySalary1 = 100;
        int monthlySalary2 = 120;
        int monthlySalary3 = 130;
        int monthlySalary4 = 150;

        int a = (int)(100 * 0.5);
        int b = (int)(120 * 0.5);
        int c = (int)(130 * 0.5);
        int d = (int)(150 * 0.5);

        System.out.println("김대리의 월급은 " + monthlySalary1+"만원 + 보너스"
                + a+"만원으로 총 " +(monthlySalary1 +a) + "만원 입금되었습니다" );
        System.out.println("김과장의 월급은 " + monthlySalary2+"만원 + 보너스"
                + b+"만원으로 총 " +(monthlySalary2 +b) + "만원 입금되었습니다" );
        System.out.println("김차장의 월급은 " + monthlySalary3+"만원 + 보너스"
                + c+"만원으로 총 " +(monthlySalary3 +c) + "만원 입금되었습니다" );
        System.out.println("김부장의 월급은 " + monthlySalary4+"만원 + 보너스"
                + d+"만원으로 총 " +(monthlySalary4 +d) + "만원 입금되었습니다" );








    }
}
