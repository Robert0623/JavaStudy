package ch8.ex;

public class Ex3 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int)(Math.random()*10); //0으로 나눌 때 ArithmeticException 발생
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println(0); //ArithmeticException이 발생하면 실행되는 코드
            }
        }
    }
}
