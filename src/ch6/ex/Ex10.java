package ch6.ex;

class Data3 {int x;}

public class Ex10 {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("after change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(Data3 d) {
        d.x = 1000;
        System.out.println("change() : x = " + d.x);

    }
}
