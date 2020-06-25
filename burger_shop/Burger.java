package burger_shop;

import java.util.Scanner;

public class Burger {
    public int MAX_TOPPINGS = 2;
    public int currentToppings = 0;
    public double basePrice = 5.00;
    public Bread breadType = new Bread();
    public Meat meatType = new Meat();

    public double lettuce = 0.45;
    public double tomatoes = 0.45;
    public double carrots = 0.50;
    public double mustard = 0.25;
    public double ketchup = 0.25;
    public double relish = 0.65;
    public double guacamole = 0.75;
    public double cheese = 0.50;
    public double mayonnaise = 0.45;
    public double bacon = 0.75;
    public double onion = 0.45;

    public double totalBurgerPrice() {
        return 0.0;
    }

    public double plainBurgerPrice() {
        return basePrice;
    }

    public double addTopping() {

        Scanner in = new Scanner(System.in);
        System.out.println("Here are the choices for toppings. Please enter the number associated with the topping you want: \n" +
                "1. Lettuce $0.45 \n" + "2. Tomatoes $0.45 \n" + "3. Carrots $0.50 \n" + "4. Mustard $0.25 \n" + "5. Ketchup $0.25 \n" +
                "6. Relish $0.65 \n" + "7. Guacamole $0.75 \n" + "8. Cheese $0.50 \n" + "9. Mayonnaise $0.45 \n" +
                "10. Bacon $0.75 \n" + "11. Onion $0.45 \n" );
        String input = in.nextLine();
        int toppingChoice = Integer.valueOf(input);

        if (currentToppings < MAX_TOPPINGS + 1)
        {
            switch (input) {
               
            }
        }

        return 0.0;
    }
}
