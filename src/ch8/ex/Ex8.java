package ch8.ex;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch(ArithmeticException ae) { //참조변수 ae로 ArithmeticException인스턴스에 접근할 수 있다.
            ae.printStackTrace();
            System.out.println("예외메세지 : "+ae.getMessage());
        }
        System.out.println(6);
    }
}
