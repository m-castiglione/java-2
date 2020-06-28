package burger_shop;

public class Meal {
    private Burger plainBurger;
    private Drink drink = Drink.coke;
    private Side side = Side.fries;

    public Meal(Burger plainBurger, Drink drink, Side fries) {
        this.plainBurger = Burger.plainBurger;
        this.drink = Drink.coke;
        this.side = Side.fries;
    }


}
