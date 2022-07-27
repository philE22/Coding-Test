package interfaceTest;

interface Customer {
    //상수
    //추상 메서드
    public abstract String getOrder();
}

class CafeCustomerA implements Customer {
    @Override
    public String getOrder() {
        return "a glass of iced americano";
    }
}

class CafeCustomerB implements Customer {

    @Override
    public String getOrder() {
        return "a glass of strawberry latte";
    }
}

class CafeOwner {
    public void giveItem(Customer customer) {
        System.out.println("Item : " + customer.getOrder());
    }
}



public class OrderExample {
    public static void main(String[] args) {
        CafeOwner cafeOwner = new CafeOwner();
        Customer a = new CafeCustomerA();
        Customer b = new CafeCustomerB();

        cafeOwner.giveItem(a);
        cafeOwner.giveItem(b);
    }
}
