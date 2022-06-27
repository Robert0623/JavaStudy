package ch8.test;

public class Test6 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println(5);
        }
    }
    static void method1() {
        try {
            method2();
            System.out.println(1);
        } catch (ArithmeticException e) {
            System.out.println(2);
        } finally {
            System.out.println(3);
        }
        System.out.println(4);
    }
    static void method2() {
        throw new NullPointerException(); //unchecked예외이므로 throws로 떠넘길 필요 없다.
    }
}
