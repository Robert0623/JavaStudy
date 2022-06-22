package ch5.test;

public class Test6 {
    public static void main(String[] args) {
        //큰 금액의 동전을 우선적으로 거슬러 줘야한다.

        //내림차순으로 정렬
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money = " + money);

        for (int i = 0; i < coinUnit.length; i++) {
            //money에서 coinUnit의 큰 금액부터 나눠서 각 개수를 저장한다.
//            int cnt = 0;
//            cnt += money / coinUnit[i];
//            System.out.println(coinUnit[i] + "원: " + cnt);
            //위 3줄과 아래 한줄은 같다.
             System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);

            money %= coinUnit[i];
        }
    }
}
