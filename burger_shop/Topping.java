package burger_shop;

public class Topping {

    private String toppingName;
    private double price;
    private boolean isHealthy;
    private int maxAmount;
    private int currentAmount;

    public static Topping tomato = new Topping("tomato", .25, true, 2, 0);
    public static Topping lettuce = new Topping("lettuce", .25, true, 2, 0);
    public static Topping onion = new Topping("onion", .25, true, 2, 0);
    public static Topping bacon = new Topping("bacon", .75, false,2, 0);
    public static Topping guacamole = new Topping("guacamole", .75, true, 2, 0);
    public static Topping mustard = new Topping("mustard", .15, false, 2, 0);
    public static Topping ketchup = new Topping("ketchup", .15, false, 2, 0);
    public static Topping cheese = new Topping("cheese", .50, false, 2, 0);

    public Topping(String toppingName, double price, boolean isHealthy, int maxAmount, int currentAmount){
        this.toppingName = toppingName;
        this.price = price;
        this.isHealthy = isHealthy;
        this.maxAmount = maxAmount;
        this.currentAmount = currentAmount;
    }

    public String getToppingName() {
        return this.toppingName;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isHealthy() {
        return this.isHealthy;
    }

    public int getMaxAmount() {
        return this.maxAmount;
    }

    public int getCurrentAmount() {
        return this.currentAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }
}
