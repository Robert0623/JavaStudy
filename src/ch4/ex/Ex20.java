package ch4.ex;

public class Ex20 {
    public static void main(String[] args) {
        //5x5 좌표 출력
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("["+i+","+j+"]");
            }
            System.out.println();
        }
    }
}
