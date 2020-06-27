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
    public ArrayList<Topping> toppingList = new ArrayList<Topping>();
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


    public ArrayList<Topping> getToppings() {
        for (int i = 0; i < toppingList.size(); i++){
            System.out.println(Arrays.toString(toppingList.toArray()));
        }
        return toppingList;
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

    public void addToppings(Topping topping) {
        if (this.toppingList.size() > 2){
            System.out.println("No more toppings allowed");
        } else {
            System.out.println("Topping Added " + topping.getToppingName());
            this.toppingList.add(topping);
        }
    }

    public void addSide(Side side) {
        if (this.sidesList.size() > 3) {
            System.out.println("No more sides allowed");
        } else {
            System.out.println("Side Added " + side.getSideName());
            this.sidesList.add(side);
        }
    }

    public void addDrink(Drink drink) {
        if (this.drinksList.size() > 1) {
            System.out.println("Only allowed one drink");
        } else {
            System.out.println("Drink Added " + drink.getDrinkName());
            this.drinksList.add(drink);
        }
    }

    public double totalPrice() {
        for (int i = 0; i < toppingList.size(); i++) {
            totalPrice += toppingList.get(i).getPrice();
            totalPrice += sidesList.get(i).getSidePrice();
            totalPrice += drinksList.get(i).getDrinkPrice();
        }
        return totalPrice + b.plainBurgerPrice();
    }
    /*public double addToppings() {


        System.out.println("Here are the choices for toppings. Please enter the number associated with the topping you want: \n" +
                "1. Lettuce $" + String.format("%.2f", lettuce) + "\n" + "2. Tomatoes $" + String.format("%.2f", tomatoes) + "\n" + "3. Carrots $" + String.format("%.2f", carrots) + "\n" + "4. Mustard $" + String.format("%.2f", mustard) + "\n" + "5. Ketchup $" + String.format("%.2f", ketchup) + "\n" +
                "6. Relish $" + String.format("%.2f", relish) + "\n" + "7. Guacamole $" + String.format("%.2f", guacamole) + "\n" + "8. Cheese $" + String.format("%.2f", cheese) + "\n" + "9. Mayonnaise $" + String.format("%.2f", mayonnaise) + "\n" +
                "10. Bacon $" + String.format("%.2f", bacon) + "\n" + "11. Onion $" + String.format("%.2f", onion) + "\n");

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int toppingChoice = Integer.valueOf(input);

        do {
            input = in.nextLine();
            switch (toppingChoice) {
                case 1: toppingPrice += lettuce;
                    currentToppings++;
                    break;
                case 2: toppingPrice += tomatoes;
                    currentToppings++;
                    break;
                case 3: toppingPrice += carrots;
                    currentToppings++;
                    break;
                case 4: toppingPrice += mustard;
                    currentToppings++;
                    break;
                case 5: toppingPrice += ketchup;
                    currentToppings++;
                    break;
                case 6: toppingPrice += relish;
                    currentToppings++;
                    break;
                case 7: toppingPrice += guacamole;
                    currentToppings++;
                    break;
                case 8: toppingPrice += cheese;
                    currentToppings++;
                    break;
                case 9: toppingPrice += mayonnaise;
                    currentToppings++;
                    break;
                case 10: toppingPrice += bacon;
                    currentToppings++;
                    break;
                case 11: toppingPrice += onion;
                    currentToppings++;
                    break;
                default:System.out.println("ERROR: Wrong choice");
                    break;
            }
        } while (input != null && currentToppings < MAX_TOPPINGS - 1);

        return toppingPrice;
    }*/
}
