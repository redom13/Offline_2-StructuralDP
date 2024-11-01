public class Shawarma implements FoodItem {
    private String name;
    private double price;

    public Shawarma() {
        this.name = "Shawarma";
        this.price = 200;
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
