package ch4.ex;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //스캐너를 사용해서 입력한 숫자가 0인지, 아닌지 출력
        //if만 사용하라.
        Scanner sc = new Scanner(System.in);

        //예제에서는 nextLine()사용
        //String tmp = sc.nextLine();
        //int input = Integer.parseInt(tmp); //또는 Integer.valueOf(tmp);
        int input = sc.nextInt(); //이 예제에서 위 두 줄과 같은 결과

        if (input == 0) {
            System.out.println("입력한 숫자는 0");
        } else { //상반된 관계에 있으므로 else 사용
            System.out.println("입력한 숫자는 0이 아님");
            System.out.println("입력한 숫자는 "+input);
        }
    }
}
