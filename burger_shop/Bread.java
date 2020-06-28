package burger_shop;

public class Bread {
    private String breadName;

    public static Bread rye = new Bread("Rye");
    public static Bread wheat = new Bread("Wheat");
    public static Bread sourdough = new Bread("Sourdough");

    public Bread(String breadName) {
        this.breadName = breadName;
    }

    public String getBreadName() {
        return this.breadName;
    }
}
