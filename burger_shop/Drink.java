package burger_shop;

public class Drink {
     private String name;
     private double price;

     public static Drink coke = new Drink("Coke", 2.99);
     public static Drink dietCoke = new Drink("Diet Coke", 2.99);
     public static Drink water = new Drink("Water", 0.00);

     public Drink(String name, double price) {
          this.name = name;
          this.price = price;
     }

     public String getDrinkName() {
          return this.name;
     }

     public double getDrinkPrice() {
          return this.price;
     }
}
