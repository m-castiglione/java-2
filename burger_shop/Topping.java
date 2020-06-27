package burger_shop;

public class Topping {

    private String toppingName;
    private double price;
    private boolean isHealthy;

    public static Topping tomato = new Topping("tomato", .25, true);
    public static Topping lettuce = new Topping("lettuce", .25, true);
    public static Topping onion = new Topping("onion", .25, true);
    public static Topping bacon = new Topping("bacon", .75, false);
    public static Topping guacamole = new Topping("guacamole", .75, true);
    public static Topping mustard = new Topping("mustard", .15, false);
    public static Topping ketchup = new Topping("ketchup", .15, false);
    public static Topping cheese = new Topping("cheese", .50, false);

    public Topping(String toppingName, double price, boolean isHealthy){
        this.toppingName = toppingName;
        this.price = price;
        this.isHealthy = isHealthy;
    }

    public String getToppingName() {
        return this.toppingName;
    }

    public double getPrice() {
        return this.price;
    }
}
