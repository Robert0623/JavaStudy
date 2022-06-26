package ch8.ex;

public class Ex9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생");
            throw e;
            //throw new Exception("고의로 발생"); //위 2줄과 동일
        } catch(Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
