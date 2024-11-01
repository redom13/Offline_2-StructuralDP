public class Wedges implements FoodItem {
    private String name;
    private double price;

    public Wedges() {
        this.name = "Wedges";
        this.price = 150;
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
