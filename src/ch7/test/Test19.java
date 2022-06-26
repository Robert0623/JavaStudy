package ch7.test;


import java.util.Arrays;

public class Test19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();
    }
}
class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {
        //1. 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드 종료
        if (money < p.price) {
            System.out.println("잔액이 부족하여 "+p+"을/를 살 수 없습니다.");
            return;
        }
        //2. 가진 돈이 충분하면 제품의 가격을 가진돈에서 뺀다
        money -= p.price;
        //3. 장바구니에 구입한 물건을 넣는다.
        add(p);
    }
    void add(Product p) {
        //1. i의 값이 장바구니의 크기보다 같거나 크면
        if (i >= cart.length) {
            //2. 기존 장바구니보다 2배 큰 새로운 배열을 생성.
            Product[] tmp = new Product[cart.length * 2];
            //3. 기존의 장바구니의 내용을 새로운 배열에 복사.
            System.arraycopy(cart,0,tmp,0,cart.length);
            //4. 새로운 장바구니와 기존의 장바구니를 바꾼다.
            cart = tmp;
        }
        //5. 물건을 장바구니에 저장한다. 그리고 i의 값을 1 증가시킨다.
        cart[i++] = p;
    }
    void summary() {
        //1. 장바구니에 담긴 물건들의 목록을 만들어서 출력
//        String itemList = Arrays.toString(cart);
//        System.out.println("cart = " + cart);
        String itemList = "";
        int sum = 0;

        for (int i = 0; i < cart.length; i++) {
            if(cart[i] == null) break;
            itemList += i==0 ? cart[i] : ", " + cart[i];
            // 2. 장바구니에 담긴 물건들의 가격을 모두 더해서 출력
            sum += cart[i].price;
        }
        System.out.println("itemList = " + itemList);
        System.out.println("sum = " + sum);

        //3. 물건을 사고 남은 금액을 출력
        System.out.println("남은금액 : " + money);
    }
}
class Product {
    int price;

    Product(int price) {
        this.price = price;
    }
}
class Tv extends Product {
    Tv() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}
class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}
class Audio extends Product {
    Audio() {
        super(50);
    }
    public String toString() {
        return "Audio";
    }
}
