package ch4.ex;

public class Ex24 {
    public static void main(String[] args) {
       //GAME OVER 구현
        int i=11;
        System.out.println("카운트를 시작합니다.");
        while (i-- != 0) {
            System.out.println(i);

            for (int j = 0; j < 2_000_000_000; j++){

            }
        }
        System.out.println("GAME OVER");
    }
}
