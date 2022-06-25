//package ch7.test;
//
//public class Test1 {
//    public static void main(String[] args) {
//        SutdaDeck deck = new SutdaDeck();
//
//        for(int i=0;i<deck.cards.length;i++) {
//            System.out.print(deck.cards[i]+",");
//        }
//    }
//}
//class SutdaDeck {
//    final int CARD_NUM = 20;
//    SutdaCard[] cards = new SutdaCard[CARD_NUM];
//
//    SutdaDeck() {
//        //1~10까지의 숫자가 적힌 카드가 한 쌍씩 존재.
//        //1, 3, 8인 카드의 각 쌍 중에 한장은 광이어야함.
//        for (int i = 0; i < cards.length; i++) {
//            //num은 1~10
//            int num = i % 10 + 1;
//            //isKwang은 i가 0~9일 때 num이 1, 3, 8인경우만 true
//            boolean isKwang = i < 10 && (num == 1 || num == 3 || num == 8);
//
//            cards[i] = new SutdaCard(num, isKwang);
//        }
//
//    }
//}
//class SutdaCard {
//    int num;
//    boolean isKwang;
//
//    SutdaCard() {
//        this(1, true);
//    }
//
//    SutdaCard(int num, boolean isKwang) {
//        this.num = num;
//        this.isKwang = isKwang;
//    }
//    public String toString() {
//        return num + (isKwang ? "K" : "");
//    }
//}