package ch6.ex;

import javax.xml.crypto.Data;

public class Ex9 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = "+d.x);

        change(d.x);
        System.out.println("after change(d.x)");
        System.out.println("main() : x ="+d.x);
    }
    static void change(int x){
        x=1000;
        System.out.println("change() : x = "+x);
    }
}
class Data2 {
    int x;
}
