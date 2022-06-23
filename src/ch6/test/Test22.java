package ch6.test;

public class Test22 {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));

        str = "1234o";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));
    }
    static boolean isNumber(String str) {
        if(str==null || str.equals("")) return false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!('0' <= ch && ch <= '9')) {
                return false;
            }
        }
        return true;
    }
}
