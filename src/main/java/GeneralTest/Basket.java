package GeneralTest;

class Flower {}
class Rose extends Flower {}
class RosePasta {}

public class Basket<T extends Flower> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }


    public static void main(String[] args) {
        Basket<Flower> flowerBasket = new Basket<>();
        Basket<Rose> roseBasket = new Basket<>();
//        Basket<RosePasta> a = new Basket<RosePasta>();
//test
        flowerBasket.setItem(new Rose());
//        flowerBasket.setItem(new RosePasta());
    }
}
