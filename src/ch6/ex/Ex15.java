package ch6.ex;

public class Ex15 {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println("result = " + result);
    }
    //아래와 동일
//    static int factorial(int n) {
//        if(n==1) return 1;
//        return n * factorial(n-1);
//    }
    static int factorial(int n) {
        int result = 0;
        if (n == 1) {
            result = 1;
        } else {
            result = n*factorial(n-1);
        }
        return result;
    }
}
