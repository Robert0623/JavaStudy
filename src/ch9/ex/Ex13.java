package ch9.ex;

public class Ex13 {
    public static void main(String[] args) {
        char[] chArr = new char[0];
        String s = new String(chArr);

        System.out.println(chArr.length);
        System.out.println("@@@"+s+"@@@");
    }
}
