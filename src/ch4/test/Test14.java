package ch4.test;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        int answer = (int)(Math.random()*100)+1;
        int input = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        do {
            count++;
            System.out.println("1과 100사이 값을 입력.>");
            input = sc.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수 입력");
            } else if (input < answer) {
                System.out.println("더 큰 수 입력");
            } else {
                System.out.println("정답입니다");
                System.out.println("시도 횟수 : "+count);
                break;
            }


        } while(true);
    }
}
