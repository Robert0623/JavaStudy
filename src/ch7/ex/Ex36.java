package ch7.ex;

public class Ex36 {
    Object iv = new Object(){void method(){}}; //익명 클래스
    static Object cv = new Object() {void method(){}}; //익명 클래스

    void myMethod() {
        Object lv = new Object() {void method(){}}; //익명 클래스
    }
}
