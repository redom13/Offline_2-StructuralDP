public class FreeItemDecorator implements FoodItem {
    private FoodItem item;

    public FreeItemDecorator(FoodItem item) {
        this.item = item;
        item.setPrice(0);
    }

    public String getName() {
        return item.getName()+" (Free!!!)";
    }

    public double getPrice() {
        return item.getPrice();
    }

    public String getDetails() {
        return item.getDetails();
    }

    public void setPrice(double price) {
        item.setPrice(price);
    }
    
}
