package ch7.ex;

public class Ex12 {
    public static void main(String[] args) {
        Card c = new Card("HEART", 10);
        System.out.println("c.KIND = " + c.KIND);
        System.out.println("c.NUMBER = " + c.NUMBER);
        System.out.println("c = " + c);
    }
}
class Card {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }
    Card() {
        this("HEART", 1);
    }
    public String toString() {
        return "KIND"+" "+NUMBER;
    }
}