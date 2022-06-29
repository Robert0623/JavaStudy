package ch9.ex;

import java.io.File;
import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("data2.txt"));
        int sum = 0;
        int cnt = 0;

        while (sc.hasNext()) {
            sum += sc.nextInt();
            cnt++;
        }
        System.out.println("sum = " + sum);
        System.out.println("average = " + (double) sum / cnt);
    }
}
