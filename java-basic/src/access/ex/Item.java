package access.ex;

public class Item {
    private String menu;
    private int price;
    private int quantity;

    public Item(String menu, int price, int quantity) {
        this.menu = menu;
        this.price = price;
        this.quantity = quantity;
    }

    public String getMenu() {
        return menu;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}
