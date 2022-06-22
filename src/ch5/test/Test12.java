package ch5.test;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        String[][] words = {
                {"chiar", "의자"},
                {"computer", "컴퓨터"},
                {"Integer", "정수"}
        };
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);
            String answer = sc.next();
            if (answer.equals(words[i][1])) {
                System.out.println("정답입니다.");
                cnt++;
            } else {
                System.out.println("틀렸습니다. 정답은 "+words[i][1]);
            }
        }
        System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.", words.length, cnt);
    }
}
