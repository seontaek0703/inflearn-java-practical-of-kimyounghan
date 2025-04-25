package class1.ex;

public class ProductOrderMain1 {

    public static void main(String[] args) {
        ProductOrder p1 = new ProductOrder();
        p1.productName = "두부";
        p1.price = 2000;
        p1.quantity = 2;

        ProductOrder p2 = new ProductOrder();
        p2.productName = "김치";
        p2.price = 5000;
        p2.quantity = 1;

        ProductOrder p3 = new ProductOrder();
        p3.productName = "콜라";
        p3.price = 1500;
        p3.quantity = 2;

        ProductOrder[] productOrders = {p1, p2, p3};

        int total = 0;

        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
            total += productOrder.price * productOrder.quantity;
        }

        System.out.println("총 결제 금액: " + total);
    }
}
