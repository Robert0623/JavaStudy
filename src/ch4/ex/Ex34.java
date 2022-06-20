package ch4.ex;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);

        outer:
        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3)을 선택하시오.(종료:0)>");

            menu = sc.nextInt();

            if (menu == 0) {
                System.out.println("프로그램 종료.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
                continue;
            }
            while(true) {
                System.out.println("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99)");
                num = sc.nextInt();

                if(num==0)
                    break;
                if(num==99)
                    break outer;
                switch(menu) {
                    case 1:
                        System.out.println("result="+num*num);
                        break;
                    case 2:
                        System.out.println("result="+Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result="+Math.log(num));
                        break;
                }
            }
        }
    }
}
