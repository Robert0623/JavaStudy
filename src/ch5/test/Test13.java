package ch5.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        String[] words = {"television", "computer", "mouse", "phone"};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray();

            //char배열 question에 담긴 문자의 위치를 임의로 바꾼다.
            for (int j = 0; j < question.length; j++) {
                int n = (int)(Math.random()*question.length);
                char tmp = question[i];
                question[i] = question[n];
                question[n] = tmp;
            }

            //question배열을 String으로 변경 - valueOf
//            words[i] = String.valueOf(question);
//            System.out.printf("Q%d. %s의 정답을 입력하세요.", i+1, words[i]);

            //위 2줄과 같다. - new String()
            System.out.printf("Q%d. %s의 정답을 입력하세요.", i+1, new String(question));
            String answer = sc.nextLine();

            //trim()으로 answer의 좌우 공백을 제거한 후, equals로 words[i]와 비교
            if (answer.trim().equals(words[i])) {
                System.out.printf("정답입니다.%n%n");
            } else {
                System.out.printf("틀렸습니다.%n%n");
            }
        }
    }
}
