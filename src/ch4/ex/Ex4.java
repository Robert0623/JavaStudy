package ch4.ex;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        //점수를 입력하면, 학점이 출력되게 하라
        int score = 0;
        char grade = 'D';

        //1. 스캐너로 점수 입력
        System.out.println("점수를 입력하시오.>");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        //2. 90이상 A, 80이상 B, 70이상 C, 나머지 D 학점
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        //3. 학점을 출력
        System.out.println("당신의 학점은 "+grade+"입니다.");
    }
}
