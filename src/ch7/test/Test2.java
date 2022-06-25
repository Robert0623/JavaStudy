package ch7.test;

public class Test2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        System.out.println("deck.pick(0) = " + deck.pick(0));
        System.out.println("deck.pick() = " + deck.pick());
        deck.shuffle();

        for(int i=0;i<deck.cards.length;i++) {
            System.out.print(deck.cards[i]+",");
        }
        System.out.println();

        System.out.println("deck.pick(0) = " + deck.pick(0));
    }
}
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        //1~10까지의 숫자가 적힌 카드가 한 쌍씩 존재.
        //1, 3, 8인 카드의 각 쌍 중에 한장은 광이어야함.
        for (int i = 0; i < cards.length; i++) {
            //num은 1~10
            int num = i % 10 + 1;
            //isKwang은 i가 0~9일 때 num이 1, 3, 8인경우만 true
            boolean isKwang = i < 10 && (num == 1 || num == 3 || num == 8);

            cards[i] = new SutdaCard(num, isKwang);
        }
    }
    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * cards.length);
            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }
    public SutdaCard pick(int index) {
        //유효성 검사
        if(!(0<= index && index <=CARD_NUM))
            return null;
        return cards[index];
    }
    public SutdaCard pick() {
//        int n = (int) (Math.random() * cards.length);
//        return cards[n];
        int index = (int) (Math.random() * cards.length);
        return pick(index);
    }
}
class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}