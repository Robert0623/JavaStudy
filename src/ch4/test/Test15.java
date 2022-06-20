package ch4.test;

public class Test15 {
    public static void main(String[] args) {
        int number = 12321;
        int tmp = number;
        String str2 = "";
        int result = 0;

        while (tmp != 0) {
            //1. number를 문자열 str로 변경
            String str = String.valueOf(number);
            //2. str을 문자로 바꿔서 str2에 ""사용해서 거꾸로 넣음
            for (int i = str.length()-1; i >= 0 ; i--) {
                char ch = str.charAt(i);
                str2 = str2 + String.valueOf(ch);
            }
            //3. 문자열을 정수로 변환
            result = Integer.valueOf(str2);
            break;
        }
            System.out.println("str2 = " + str2);
        if (number == result) {
            System.out.println(number + "는 회문수 입니다.");
        } else {
            System.out.println(number+"는 회문수가 아닙니다.");
        }

    }
}
