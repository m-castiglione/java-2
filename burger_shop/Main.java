package burger_shop;

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application
        Burger burger = new Burger();
        System.out.println(burger.breadType.bread);
        burger.addTopping();
    }
}
