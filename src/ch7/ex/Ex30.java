package ch7.ex;

public class Ex30 {
    public static void main(String[] args) {
        MyChild c = new MyChild();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}
class MyChild extends MyParent implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in Child");
    }
}
class MyParent {
    public void method2(){
        System.out.println("method2() in Parent");
    }
}
interface MyInterface {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }
    default void method2() {
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}
interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}
