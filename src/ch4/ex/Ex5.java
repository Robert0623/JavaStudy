package ch4.ex;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        //점수를 입력해서 학점을 구하라 - 2
        //1. 점수, 학점 변수 선언 및 초기화
        int score = 0;
        char grade = 'C';
        char opt = '0';

        //2. 스캐너로 점수를 입력받음
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        //3. 90이상이면 A학점 뒤에 추가 98점이상이면 +, 94점 미만이면 -, 나머지 0를 붙이고,
        //80이상 B학점이고, 위와 동일,
        //나머지는 C학점.
        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if(score < 94) {
                opt = '-';
            } else {
                opt = '0'; //위에 0으로 opt를 초기화 했으므로 실제로는 필요없음
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if(score < 84) {
                opt = '-';
            } else {
                opt = '0'; //위에 0으로 opt를 초기화 했으므로 실제로는 필요없음
            }
        } else {
            grade = 'C';
        }
    //4. 학점 출력
        System.out.println("당신의 학점은 "+grade+opt+"입니다.");
    }
}

