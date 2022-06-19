package ch3.ex;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        //nextInt(), next(), nextLine()
        //의미없는 예제. 위에 3개를 까먹지는 말자.
        Scanner sc = new Scanner(System.in);
        char ch = ' ';
        System.out.println("문자를 하나 입력하시오.>");
        String input = sc.next();
        ch = input.charAt(0);

        if ('0' <= ch && ch <= '9') {
            System.out.println("입력한 문자는 숫자");
        } else if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.println("입력한 문자는 영문자");
        }
    }
}
