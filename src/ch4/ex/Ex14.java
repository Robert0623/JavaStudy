package ch4.ex;

public class Ex14 {
    public static void main(String[] args) {
        //초기값 2개, 증감식 2개
        //1.
        for (int i = 1, j = 10; i <= 10; i++, j--) {
            System.out.println(i+" "+j);
        }
        //2.
        for (int i = 1, j = 10; i <= 10; i++) {
            System.out.println(i+" "+(j-i+1));
        }
    }
}
