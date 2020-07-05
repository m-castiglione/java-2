package burger_shop;

public class DeluxeBurger extends Burger{
    private static final int MAX_TOPPINGS = 6;

    public DeluxeBurger(Bread bread, Meat meat) {
        super(bread, meat);
    }

    @Override
    public void addToppings(Topping... toppings) {
        for (Topping t : toppings) {
            if (this.toppingList.size() >= MAX_TOPPINGS) {
                System.out.println(t.getToppingName() + " is excluded. No more toppings allowed");
            } else {
                System.out.println("Topping Added:  " + t.getToppingName());
                this.toppingList.add(t);
            }
        }
    }
}
