package burger_shop;

import java.util.ArrayList;
import java.util.Arrays;

public class Burger {
    public double basePrice = 5.00;
    public ArrayList<Topping> toppingList = new ArrayList<Topping>();
    public ArrayList<Meat> meatList = new ArrayList<Meat>();
    public ArrayList<Bread> breadList = new ArrayList<Bread>();
    private Bread bread;
    private Meat meat;
    private static final int MAX_TOPPINGS = 2;

    public static Burger plainBurger = new Burger(Bread.rye, Meat.beef);

    public double plainBurgerPrice() {
        return basePrice;
    }

    public Burger(Bread bread, Meat meat){
        this.bread = bread;
        this.meat = meat;
    }

    public void addMeat(Meat meat) {
        if (this.meatList.size() > 1) {
            System.out.println("You can only have one type of meat, dude");
        } else {
            System.out.println("Meat Added: " + meat.getMeatName());
            this.meatList.add(meat);
        }
    }

    public void addBread(Bread bread) {
        if (this.breadList.size() > 1) {
            System.out.println("You can only have one type of bread, dude");
        } else {
            System.out.println("Bread Added: " + bread.getBreadName());
            this.breadList.add(bread);
        }
    }

    public void addToppings(Topping... toppings) {
        for (Topping t : toppings) {
            if (this.toppingList.size() >= MAX_TOPPINGS) {
                System.out.println(t.getToppingName() + " is excluded. No more toppings allowed");
            } else if (t.getCurrentAmount() >= t.getMaxAmount()) {
                System.out.println("Can't have extra helpings");
            } else {
                System.out.println("Topping Added:  " + t.getToppingName());
                t.setCurrentAmount(t.getCurrentAmount() + 1);
                this.toppingList.add(t);
            }
        }
    }

    public ArrayList<Topping> getToppings() {
        for (int i = 0; i < toppingList.size(); i++){
            System.out.println(Arrays.toString(toppingList.toArray()));
        }
        return toppingList;
    }

    public double getTotalToppingsPrice() {
        double totalPrice = 0.0;
        for (int i = 0; i < toppingList.size(); i++) {
            totalPrice += toppingList.get(i).getPrice();
        }
        return totalPrice + basePrice;
    }
}

//Solid Principles-Liskov
//Use a do while for toppings