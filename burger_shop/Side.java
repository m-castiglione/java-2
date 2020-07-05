package burger_shop;

public class Side {
    private String sideName;
    private double price;

    public static Side fries = new Side("Fries", 2.49);
    public static Side chips = new Side("Chips", 1.49);
    public static Side pie = new Side("Pie", 2.49);
    public static Side macNCheese = new Side("Mac n Cheese", 1.49);

    public Side(String sideName, double price) {
        this.sideName = sideName;
        this.price = price;
    }

    public String getSideName() {
        return this.sideName;
    }

    public double getSidePrice() {
        return this.price;
    }
}
