public class Fries implements FoodItem {
    private String name;
    private double price;

    public Fries() {
        this.name = "Fries";
        this.price = 100;
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
