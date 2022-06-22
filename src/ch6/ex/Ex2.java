package ch6.ex;

class Tv2 {
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}
public class Ex2 {
    public static void main(String[] args) {
        Tv2 t1 = new Tv2();
        Tv2 t2 = new Tv2();
        System.out.println("t1.channel = " + t1.channel);
        System.out.println("t2.channel = " + t2.channel);

        t2 = t1; //t1이 저장하고 있는 주소를 t2에 저장한다.
        t1.channel = 7;
        System.out.println("t1.channel = " + t1.channel);
        System.out.println("t2.channel = " + t2.channel);
    }
}
