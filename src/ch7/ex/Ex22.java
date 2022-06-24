//package ch7.ex;
//
//public class Ex22 {
//    public static void main(String[] args) {
//        Buyer b = new Buyer();
//        b.buy(new Tv());
//        b.buy(new Computer());
//        b.buy(new Audio());
//        b.summary();
//    }
//}
//class Product {
//    int price;
//    int bonusPoint;
//
//    Product(int price) {
//        this.price = price;
//        bonusPoint = (int) (price / 10.0);
//    }
//}
//
//class Tv extends Product {
//    Tv() {
//        super(100);
//    }
//    public String toString() {
//        return "Tv";
//    }
//}
//class Computer extends Product {
//    Computer() {
//        super(200);
//    }
//    public String toString() {
//        return "Computer";
//    }
//}
//class Audio extends Product {
//    Audio() {
//        super(50);
//    }
//    public String toString() {
//        return "Audio";
//    }
//}
//class Buyer {
//    int money = 1000;
//    int bonusPoint = 0;
//    Product[] items = new Product[10];
//    int i = 0;
//
//    void buy(Product p) {
//        if (money < p.price) {
//            System.out.println("잔액 부족");
//            return;
//        }
//
//        money -= p.price;
//        bonusPoint += p.bonusPoint;
//        items[i++] = p;
//        System.out.println(p+"을/를 구입하셨습니다.");
//    }
//    void summary() {
//        int sum = 0;
//        String itemList = "";
//
//        for (int i = 0; i < items.length; i++) {
//            if(items[i]==null) break;
//            sum += items[i].price;
//            itemList += items[i]+", ";
//        }
//        System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
//        System.out.println("구입하신 제품은 "+itemList+"입니다.");
//    }
//}
