package ch4.ex;

public class Ex29 {
    public static void main(String[] args) {
        //1~100까지 3,6,9게임 만들기
        //십의자리, 일의자리수에 3,6,9가 있는지 각각 비교
        for (int i = 1; i <= 100; i++) {
            System.out.printf("i=%d ", i);

            //i는 for문 제어에 사용되는 변수이기 때문에
            //tmp에 저장해서 처리.
            int tmp = i;

            do {
                //tmp%10(1의자리수)이 3의 배수인지 확인
                //tmp%10이 0이면 tmp%10%3은 무조건 0이 되므로,
                //tmp%10이 0인 것은 제외(10, 20, 30 ...)
                if (tmp % 10 % 3 == 0 && tmp % 10 != 0)
                    System.out.print("짝");
            } while((tmp/=10)!=0); //10의 자리가 0이 아니면 10의자리 수로 다시 반복
            System.out.println();
        }
    }
}

