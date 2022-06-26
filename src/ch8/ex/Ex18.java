package ch8.ex;

public class Ex18 {
    public static void main(String[] args) {
        method1();
        System.out.println("method1()의 실행을 마치고 main메서드로 돌아옴.");
    }
    static void method1() {
        try {
            System.out.println("method1()이 호출되었습니다.");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1()의 finally블럭이 실행되었씁니다.");
        }
    }
}
