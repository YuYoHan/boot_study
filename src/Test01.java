class Product {
    int price;
    int bonusPoint;

    public Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv extends Product {
    Tv() {
        super(100);
    }
    public String toString() {return  "Tv";}
}
class Computer extends Product{
    Computer() {
        super(200);
    }
    public String toString() {return  "Computer";}
}

class Audio extends Product {
    Audio() {
        super(50);
    }
    public String toString() {return "Audio";}
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product[] cart = new Product[10];
    int i = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 구매할 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(p + "을/를 구매했습니다.");
    }

    // 구매한 물품에 대한 정보를 요약해서 보내준다.
    void summary() {
        int sum = 0;                // 구입한 물품의 함계
        String itemList = "";       // 구입한 물품목록

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < cart.length; i++) {
            if(cart[i] == null) break;
            sum += cart[i].price;
            itemList += cart[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 물품은 " + itemList + "입니다.");
    }
}

public class Test01 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();
    }
}
