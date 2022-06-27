package ch8.test;

public class Test7 {
    public static void main(String[] args) {
        method(true);
        method(false);
    }

    static void method(boolean b) {
        try {
            System.out.println(1);
            if (b) System.exit(0); //프로그램 즉시종료 - finally블럭 실행 X.
            System.out.println(2);
        } catch (RuntimeException r) {
            System.out.println(3);
            return;
        } catch(Exception e) {
            System.out.println(4);
            return;
        } finally {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
