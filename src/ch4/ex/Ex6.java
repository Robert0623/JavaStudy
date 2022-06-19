package ch4.ex;

import java.util.Scanner;

public class Ex6 {
    //swtich문으로 현재 월을 입력받아, 3~5는 봄, 6~8은 여름, 9~11은 가을, 12~2는 겨울을 출력
    public static void main(String[] args) {
        //1. 스캐너로 현재 월을 입력받음.
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        //2. switch문으로 작업 후 출력
        switch(month) {
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("겨울");
        }
    }
}
