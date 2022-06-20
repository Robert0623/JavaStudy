package ch4.test;

public class Test9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int j = ch-'0';
            sum += j;
        }
        System.out.println("sum = " + sum);
    }
}
