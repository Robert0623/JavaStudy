package ch5.ex;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"Integer", "정수"}
        };
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?%n",i+1,words[i][0]);
            String answer = sc.next();

            if (answer.equals(words[i][1])) {
                System.out.println("정답입니다.");
            } else {
                System.out.println("틀렸습니다. 정답은 "+words[i][1]+"입니다.");
            }
        }

    }
}
