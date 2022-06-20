package ch4.ex;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        //반복해서 숫자를 입력받다가 0을 입력하면 입력을 마치고 총 합을 출력
        //1. 변수 선언, 초기화
        int num = 0;
        int sum = 0;
        boolean flag = true; //반복문의 조건식
        System.out.println("합계를 구할 숫자를 입력.(종료는 0)");
        Scanner sc = new Scanner(System.in);

        //2. 반복문으로 처리
        while (flag) {
            System.out.println(">>");
            num = sc.nextInt();
            if (num != 0) {
                sum += num;
            } else {
                flag = false;
            }
        }
        System.out.println("합계 : "+sum);
    }
}
