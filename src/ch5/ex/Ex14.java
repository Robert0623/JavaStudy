package ch5.ex;

public class Ex14 {
    public static void main(String[] args) {
        String src = "ABCDE";

        //문자열 src의 각 요소를 문자로 바꿔서 출력
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println("src.charAt(" + i + ")=" + ch);
        }
        //문자열 src를 문자배열로 변환
        char[] chArr = src.toCharArray();
        System.out.println(chArr);
    }
}
