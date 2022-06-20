package ch4.ex;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        //1~100사이 정수를 입력받아서, 임의의 수를 맞추는 예제
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int answer = (int)(Math.random()*100)+1;

        System.out.println("answer = " + answer);

        do {
            System.out.println("1~100사이 정수를 입력하시오.>>");
            input = sc.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수를 입력");
            } else if(input < answer) {
                System.out.println("더 큰 수를 입력");
            }
        } while(input!=answer);
        System.out.println("정답입니다.");
    }
}
