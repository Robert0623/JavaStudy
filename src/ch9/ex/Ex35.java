package ch9.ex;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] argArr = null;

        while(true) {
            System.out.println(">>");
            String input = sc.nextLine().trim();
            argArr = input.split(" +");
            if(input.equals(""))
                continue;
            input = input.toLowerCase();

            if(input.equals("q")) {
                System.exit(0);
            }
            else {
                for (int i = 0; i < argArr.length; i++) {
                    System.out.println(argArr[i]);
                }
            }
        }
    }
}
