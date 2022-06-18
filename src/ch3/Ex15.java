package ch3;

public class Ex15 {
    public static void main(String[] args) {
        //문자형 소문자 a를 대문자 A로 바꿈
        //소문자에서 정수형 32를 빼면 대문자가 된다
        char lowerCase = 'a';
        char upperCase = (char)(lowerCase - 32);
        System.out.println("upperCase = " + upperCase);
    }
}
