package ch8.test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        //1~100사이의 임의의 값을 얻어서 answer에 저장한다.
        int answer = (int)(Math.random()*100)+1;
        int input = 0; //사용자입력을 저장할 공간
        int count = 0; //시도횟수를 세기 위한 변수

        do {
            count++;
            System.out.println("1과 100사이 값을 입력하시오>>");

            try {
                input = new Scanner(System.in).nextInt(); //더 간단한 스캐너 사용방법
            } catch (Exception e) {
                System.out.println("유효하지 않은 값입니다. 다시 값을 입력하세요.");
                continue;
            }

            if (answer > input) {
                System.out.println("더 큰수를 입력하시오.");
            } else if (answer < input) {
                System.out.println("더 작은수를 입력하시오.");
            } else {
                System.out.println("맞췄습니다.");
                System.out.println("시도횟수는 "+count+"번입니다.");
                break;
            }
        } while(true); //무한반복문
    }
}
