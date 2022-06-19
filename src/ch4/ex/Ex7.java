package ch4.ex;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        //컴퓨터와 가위바위보를 하는 게임
        //1(가위), 2(바위), 3(보) 중 하나를 입력받고,
        //컴퓨터는 1~3 중 임의의 수를 선택.
        //그림 또는 숫자로 무승부, 나의 승, 컴퓨터 승의 경우를 확인.
        //두 수를 빼서 0은 무승부, 1, -2, 나의 승, -1, 2는 컴퓨터 승을 출력

        //1. 1 ~ 3 정수를 입력
        Scanner sc = new Scanner(System.in);
        int myNum = sc.nextInt();

        //2. 컴퓨터 1 ~ 3 정수를 선택
        int comNum = (int)(Math.random()*3)+1;

        //3. 나, 컴퓨터의 숫자를 출력
        System.out.println("myNum = " + myNum);
        System.out.println("comNum = " + comNum);

        //4. 결과 계산 후 출력
        switch(myNum - comNum) {
            case 0:
                System.out.println("무승부");
                break;
            case 1: case -2:
                System.out.println("나의 승");
                break;
            default: //case -1: case 2:
                System.out.println("컴퓨터 승");
                break;
        }
    }
}
