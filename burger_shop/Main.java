package burger_shop;

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application
        Burger burger = new Burger();
        Bread bread = new Bread();
        Meat meat = new Meat();
        //burger.addToppings();
        DeluxeBurger dB = new DeluxeBurger();
        //Order order = new Order(burger, )
        Order order = new Order(dB, bread, meat);
        order.addToppings(Topping.bacon);
        order.addSide(Side.pie);
        order.addDrink(Drink.coke);
        order.purchaseOrder();
    }
}
