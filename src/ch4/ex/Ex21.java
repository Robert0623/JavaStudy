package ch4.ex;

public class Ex21 {
    public static void main(String[] args) {
        //역슬러시모양 좌표
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if(i==j)
                    System.out.print("["+i+","+j+"]");
                else
                    System.out.printf("%5c",' ');
            }
            System.out.println();
        }
    }
}
