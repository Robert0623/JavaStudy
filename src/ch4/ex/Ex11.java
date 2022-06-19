package ch4.ex;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        //주민번호로 성별 구하기 - 2
        //중첩 swtich로 생일 2000년 이전 이후 및 성별 구분하기

        //1. 주민등록번호를 입력받고, 7번째 자리를 뽑아냄.
        Scanner sc = new Scanner(System.in);
        String regNo = sc.next();
        char gender = regNo.charAt(6);
        System.out.println(gender);

        //2. 작업 및 출력
        switch (gender) {
            case '1': case '3':
                switch(gender) {
                    case '1':
                        System.out.println("2000년 이전 남성");
                        break; //빼먹지 말자
                    case '3':
                        System.out.println("2000년 이후 남성");
                        break;
                }
                break;
            case '2': case '4':
                switch(gender) {
                    case '2':
                        System.out.println("2000년 이전 여성");
                        break;
                    case '4':
                        System.out.println("2000년 이후 여성");
                        break;
                }
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    }
}
