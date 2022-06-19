package ch3.ex;

public class Ex14 {
    public static void main(String[] args) {
        //'a'~'z', 'A'~'Z', '0'~'9'를 출력
        //a~z는 26개
        char c = 'a'; //문자형 알파벳과 숫자를 저장할 변수
        for (int i = 0; i < 26; i++) {
            System.out.print(c++);
        }
        System.out.println();
        c = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.print(c++);
        }
        System.out.println();
        c = '0';
        for (int i = 0; i < 10; i++) {
            System.out.print(c++);
        }
    }
}
