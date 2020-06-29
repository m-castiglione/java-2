package burger_shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Order {

    public final static int MAX_TOPPINGS = 2;
//    public int currentToppings = 0;

//    public double toppingPrice = 0.0;
//
//    public double lettuce = 0.45;
//    public double tomatoes = 0.45;
//    public double carrots = 0.50;
//    public double mustard = 0.25;
//    public double ketchup = 0.25;
//    public double relish = 0.65;
//    public double guacamole = 0.75;
//    public double cheese = 0.50;
//    public double mayonnaise = 0.45;
//    public double bacon = 0.75;
//    public double onion = 0.45;
    private Burger b;
    private Bread bread;
    private Meat meat;
    private Meal meal;

    private double totalPrice;

    public ArrayList<Side> sidesList = new ArrayList<Side>();
    public ArrayList<Drink> drinksList = new ArrayList<Drink>();
    public ArrayList<Burger> burgerList = new ArrayList<Burger>();

    public Order (Burger burger, Bread bread, Meat meat) {
        this.b = burger;
        this.bread = bread;
        this.meat = meat;
    }

    public Order (Meal meal) {
        this.meal = meal;
    }

    void purchaseOrder() {
        System.out.println(totalPrice());
        Scanner in = new Scanner(System.in);
        System.out.println("Does this complete your order?");
        String input = in.nextLine();
        if (input.toLowerCase().equals("yes")) {
            System.out.println("Thanks! Your order will be out shortly");
        } else if (input.toLowerCase().equals("no")) {
            System.out.println("Order is cancelled");
        } else {
            System.out.println("I don't know what you're saying");
            purchaseOrder();
        }
    }

    public Burger getB() {
        return b;
    }

    public ArrayList<Side> getSides() {
        for (int i = 0; i < sidesList.size(); i++) {
            System.out.println(Arrays.toString(sidesList.toArray()));
        }
        return sidesList;
    }

    public ArrayList<Drink> getDrinks() {
        for (int i = 0; i < drinksList.size(); i++) {
            System.out.println(Arrays.toString(drinksList.toArray()));
        }
        return drinksList;
    }

    public ArrayList<Burger> getBurgers() {
        for (int i = 0; i < burgerList.size(); i++) {
            System.out.println(Arrays.toString(burgerList.toArray()));
        }
        return burgerList;
    }


    public void addSides(Side... side) {
        for (Side s : side) {
            if (this.sidesList.size() >= 3) {
                System.out.println("No more sides allowed");
            } else if (this.sidesList.contains(s)){
                System.out.println("Can't have duplicate sides");
            } else {
                System.out.println("Side Added: " + s.getSideName());
                this.sidesList.add(s);
            }
        }
    }

    //Adds a drink to the order
    public void addDrink(Drink drink) {
        if (this.drinksList.size() > 1) {
            System.out.println("Only allowed one drink");
        } else {
            System.out.println("Drink Added " + drink.getDrinkName());
            this.drinksList.add(drink);
        }
    }

    public void addBurger(Burger burger) {
        if (this.burgerList.size() > 1) {
            System.out.println("You can only have one burger type per order");
        } else {
            System.out.println("Burger Added");
            this.burgerList.add(burger);
        }
    }

        //Gets total price of an order
    public double totalPrice() {
        for (int i = 0; i < sidesList.size(); i++) {
            totalPrice += sidesList.get(i).getSidePrice();
        }

        for (int i = 0; i < drinksList.size(); i++) {
            totalPrice += drinksList.get(i).getDrinkPrice();
        }

        totalPrice += b.getTotalToppingsPrice();

        return totalPrice + b.plainBurgerPrice();
    }
}
