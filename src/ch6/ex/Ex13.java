package ch6.ex;

public class Ex13 {
    public static void main(String[] args) {
        Ex13 e = new Ex13();
        int result = e.add(3, 5);
        System.out.println("result = " + result);

        int[] result2 = {0};
        e.add(3, 5, result2);
        System.out.println("result2[0] = " + result2[0]);
    }

    int add(int a, int b) {
        return a + b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a + b;
    }
}
