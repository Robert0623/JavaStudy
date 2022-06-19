package ch3.test;

public class Test2 {
    public static void main(String[] args) {
        //사과개수를 바구니에 담을 때 필요한 바구니수를 구함
        int appleNum = 121;
        int bucket = 10;

        //Math.ceil()사용
        int numOfBucket = (int)Math.ceil(appleNum / (double)bucket);

        //삼항연산자 사용
//        int numOfBucket = appleNum%bucket!=0 ? appleNum/bucket + 1 : appleNum/bucket;
        System.out.println("numOfBucket = " + numOfBucket);
    }
}
