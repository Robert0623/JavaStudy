package ch6.ex;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println("main메서드 시작"); //1
        firstMethod();
        System.out.println("main메서드 끝"); //6
    }
    static void firstMethod() {
        System.out.println("first메서드 시작"); //2
        secondMethod();
        System.out.println("first메서드 끝"); //5
    }
    static void secondMethod() {
        System.out.println("secondMethod() 시작"); //3
        System.out.println("secondMethod() 끝"); //4
    }
}
