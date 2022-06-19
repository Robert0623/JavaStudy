package ch4.ex;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        //주민번호 입력받아서(숫자만), 성별 구분하기.
        //7번째자리의 수가 1,3은 남자, 2,4는 여자
        //성별 구분이 안되는 주민번호는 오류 출력

        //1. 주민번호 입력받기
        Scanner sc = new Scanner(System.in);
        String regNo = sc.next();
        char gender = regNo.charAt(6);
        System.out.println("gender = " + gender);

        //2. 7번째 자리 수로 성별을 출력
        switch (gender) {
            case '1': case '3':
                System.out.println("남성");
            case '2': case '4':
                System.out.println("여성");
            default:
                System.out.println("유효하지 않은 주민번호입니다.");
        }
    }
}
