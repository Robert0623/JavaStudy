package ch5.ex;

public class Ex15 {
    public static void main(String[] args) {
        //문자열을 모스부호로 변환하는 예제
        //16진수를 2진수로 변환하는 예제와 비슷

        String source = "SOSHELP";
        String[] morse = {}; //모스부호는 생략하고 풀이과정 확인
        String result = "";

        for (int i = 0; i < source.length(); i++) {
            result += morse[source.charAt(i) - 'A'];
            
        }
    }
}
