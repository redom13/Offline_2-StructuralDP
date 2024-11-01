public class Drink implements FoodItem {
    private String name;
    private double price;

    public Drink() {
        this.name = "Drink";
        this.price = 25;
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
