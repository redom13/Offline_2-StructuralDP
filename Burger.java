public class Burger implements FoodItem {
    private String name;
    private double price;

    public Burger() {
        this.name = "Burger";
        this.price = 300;
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
