import java.util.ArrayList;

public class Combo1 implements FoodItem {
    private String name;
    private double price;
    private double discount;
    protected ArrayList<FoodItem> items;

    public Combo1() {
        this.name = "Combo1(Burger+Fries+Drink)";
        this.price = 400;
        this.discount = 0;
        items = new ArrayList<FoodItem>();
        items.add(new Burger());
        items.add(new Fries());
        items.add(new Drink());
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public String getDetails(){
        return name+"- "+(int)price+"tk";
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
}
