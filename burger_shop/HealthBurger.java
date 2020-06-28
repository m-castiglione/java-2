package burger_shop;

public class HealthBurger extends Burger{
    public static final int MAX_TOPPINGS = 4;

    public HealthBurger(Bread bread, Meat meat) {
        super(bread, meat);
    }

    @Override
    public void addToppings(Topping... toppings) {
        for (Topping t : toppings) {
            if (this.toppingList.size() >= MAX_TOPPINGS) {
                System.out.println(t.getToppingName() + " is excluded. No more toppings allowed");
            } else if (!t.isHealthy()) {
                System.out.println(t.getToppingName() + " is not a healthy topping");
            } else {
                System.out.println("Topping Added: " + t.getToppingName());
                this.toppingList.add(t);
            }
        }
    }
}
