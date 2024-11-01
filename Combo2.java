import java.util.ArrayList;

public class Combo2 implements FoodItem {
    private String name;
    private double price;
    protected ArrayList<FoodItem> items;
    public Combo2() {
        this.name = "Combo2(Shawarma + Drink)";
        this.price = 215;
        items = new ArrayList<FoodItem>();
        items.add(new Shawarma());
        items.add(new Drink());
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDetails(){
        return name+"- "+(int)price+"tk";
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
