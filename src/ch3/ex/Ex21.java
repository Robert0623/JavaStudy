package ch3.ex;

public class Ex21 {
    public static void main(String[] args) {
        //비교연산자의 연산
        //비교연산자도 이항연산자이므로 연산을 수행하기 직전
        //자동형변환을 통해 두 피연산자의 타입을 같게(큰범위의 타입으로) 맞춘다.
        System.out.printf("10==10.0f = %b%n", 10 == 10.0f); //true
        System.out.printf("'0'==0 = %b%n", '0' == 0); //false
        System.out.printf("'A'==65 = %b%n", 'A' == 65); //true
        System.out.printf("'A'>'B' = %b%n", 'A' > 'B'); //false
        System.out.printf("'A'+1!='B' = %b%n", 'A' + 1 != 'B'); //false
    }
}
