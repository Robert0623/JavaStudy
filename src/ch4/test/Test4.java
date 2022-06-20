package ch4.test;

public class Test4 {
    public static void main(String[] args) {
        int sum = 0;
        int s = 1; //값의 부호를 바꿔주는데 사용할 변수
        int num = 0;

        //for문으로 하면
//        for (int i = 1; true; i++, s = -s) {
//            num = s * i;
//            sum += num;
//
//            if (sum >= 100) {
//                break;
//            }
//        }

        //while문으로 하면
        int i = 1;
        while(true) {
            num = s * i;
            sum += num;
            i++;
            s = -s;
            if (sum >= 100) {
                break;
            }
        }
        System.out.println("num = " + num);
        System.out.println("sum = " + sum);
    }
}
