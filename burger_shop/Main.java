package burger_shop;

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application
        Burger burger = new Burger(Bread.rye, Meat.beef);
        Order order = new Order(burger, Bread.rye, Meat.beef);
        burger.addToppings(Topping.bacon);
        burger.addToppings(Topping.tomato);
        burger.addToppings(Topping.cheese);
        System.out.println(String.format("%.2f", burger.getTotalToppingsPrice()));
        System.out.println(String.format("%.2f", burger.plainBurgerPrice()));
        System.out.println(order.getB());
        HealthBurger hB = new HealthBurger(Bread.rye, Meat.beef);
        hB.addToppings(Topping.lettuce, Topping.tomato, Topping.cheese, Topping.onion);
        Meal meal = new Meal(Burger.plainBurger, Drink.coke, Side.fries);
        System.out.println(meal);
        order.addSides(Side.pie, Side.fries);
        DeluxeBurger dB = new DeluxeBurger(Bread.rye, Meat.beef);
        Order o = new Order(burger, Bread.sourdough, Meat.roastBeef);
        o.addSides(Side.pie, Side.fries, Side.chips, Side.macNCheese);
        o.purchaseOrder();
//        dB.addToppings(Topping.cheese);
//        dB.addToppings(Topping.tomato);
//        dB.addToppings(Topping.bacon);
//        dB.addToppings(Topping.onion);
//        dB.addToppings(Topping.guacamole);
//        dB.addToppings(Topping.lettuce);
//        dB.addToppings(Topping.ketchup);
    }
}
