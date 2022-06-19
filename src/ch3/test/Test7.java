package ch3.test;

public class Test7 {
    public static void main(String[] args) {
        //화씨를 섭씨로 변환
        //C = 5/9 * (F - 32)
        //변환 결과값은 소수점 셋재자리에서 반올림
        //Math.round() 사용O, 사용X 둘 다

        int fahrenheit = 100;
        //Math.round() 사용O
//        float celcius = Math.round((5/9.0f * (fahrenheit - 32))*100)/100.0f;

        //Math.round() 사용X - 1번 방법
//        float celcius = (int)((5/9.0f * (fahrenheit - 32)+0.005f)*100)/100.0f;

        //Math.round() 사용X - 2번 방법
        float celcius = (int)((5/9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;

        System.out.println(celcius);
    }
}
