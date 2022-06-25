package ch7.test;

public class Test14 {
    public static void main(String[] args) {
        MySutdaCard card = new MySutdaCard(1, true);
    }
}
class MySutdaCard {
    final int NUM;
    final boolean IS_KWANG;

    MySutdaCard() {
        this(1, true);
    }

    MySutdaCard(int num, boolean isKwang) {
        this.NUM = num;
        this.IS_KWANG = isKwang;
    }

    @Override
    public String toString() {
        return "MySutdaCard{" +
                "num=" + NUM +
                ", isKwang=" + IS_KWANG +
                '}';
    }
}
