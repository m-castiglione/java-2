package burger_shop;

public class Meat {
    private String meatName;

    public static Meat beef = new Meat("Beef");
    public static Meat roastBeef = new Meat("Roast Beef");
    public static Meat chicken = new Meat("Chicken");

    public Meat(String meatName) {
        this.meatName = meatName;
    }

    public String getMeatName() {
        return this.meatName;
    }
}
