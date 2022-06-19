package ch4.ex;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        //switch문을 이용해서 학점을 구하라
        //90이상 A, 80이상 B, 70이상 C, 나머지 F

        //1. 점수를 입력받는다
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        char grade = 'F';

        //2. switch문으로 학점을 구한다. 10으로 나눈 몫으로 작업하면 간결.
        switch(score/10) {
            case 9: case 10:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }
        System.out.println("당신의 학점은 "+grade+"입니다.");
    }
}
