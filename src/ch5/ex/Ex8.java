package ch5.ex;

public class Ex8 {
    public static void main(String[] args) {
        //로또번호 생성 예제
        //앞의 6자리(0~5)값을 45자리(0~44)의 값과 바꾼다.

        int[] ball = new int[45];

        //ball을 1~45로 초기화
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        int tmp = 0; //두 값을 바꾸는데 사용할 임시 변수
        int j = 0; //임의의 값을 저장할 변수

        //배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45); //0~44
            tmp = ball[i]; //ball[i](0~5)와 ball[j](0~44)의 값을 서로 바꾼다
            ball[i] = ball[j];
            ball[j] = tmp;
        }

        //배열 ball의 앞에서 부터 6개의 요소(0~5)를 출력
        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
        }
    }
}
