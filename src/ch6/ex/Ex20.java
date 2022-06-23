package ch6.ex;

class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    static int cv2 = new MemberCall().iv;

    static void staticMethod1() {
        System.out.println(cv);
        System.out.println(new MemberCall().iv); //클래스메서드에서 iv바로 사용 불가
        MemberCall c = new MemberCall();
        System.out.println(c.iv); //객체 생성 후 iv참조가능
    }
    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv); //인스턴스메서드에서는 iv를 바로 사용가능
    }
    static void staticMethod2() {
        staticMethod1();
        new MemberCall().instanceMethod1(); //클래스메서드에서는 인스턴스메서드 바로 호출 불가
        MemberCall c = new MemberCall();
        c.instanceMethod1(); //인스턴스 생성 후 인스턴스메서드 호출가능
    }
    void instanceMethod2() {
        staticMethod1(); //인스턴스메서드에서는 인스턴스메서드, 클래스메서드 모두 인스턴스 생성없이 바로 호출 가능.
        instanceMethod1();
    }
}

public class Ex20 {
    public static void main(String[] args) {

    }
}
