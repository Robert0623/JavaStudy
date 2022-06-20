package ch4.ex;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) sqare root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)을 선택하시오.(종료:0)>");

            menu = sc.nextInt();

            if(menu==0){
                System.out.println("프로그램 종료");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 입력하셨습니다. (종료는 0)");
                continue;
            }
            System.out.println("선택한 메뉴는 "+menu+"번 입니다.");
        }
    }
}
