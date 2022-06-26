package ch8.ex;

public class Ex11 {
    public static void main(String[] args) {
        throw new RuntimeException(); //RuntimeException은 예외처리 강제 X
//        throw new Exception(); //Exception은 에외처리 필수
    }
}
