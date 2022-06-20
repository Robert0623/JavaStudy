package ch4.ex;

public class Ex31 {
    public static void main(String[] args) {
        //1~10사이 숫자를 출력하되 3의 배수는 제외
        for (int i = 1; i <= 10; i++) {
            if(i%3==0)
                continue;
            System.out.println("i = " + i);
        }
    }
}
