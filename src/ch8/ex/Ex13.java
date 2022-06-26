package ch8.ex;

public class Ex13 {
    public static void main(String[] args) {
        method1();
    }
    static void method1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1()에서 예외가 처리됨");
            e.printStackTrace();
        }
    }
}

