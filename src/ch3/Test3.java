package ch3;

public class Test3 {
    public static void main(String[] args) {
        //삼항연산자를 써서 num의 값에 따라 양수, 음수, 0을 출력
        int num=0;
        System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));
    }
}
