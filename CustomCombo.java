import java.util.ArrayList;

public class CustomCombo implements FoodItem{
    private String name;
    private double price;
    private double discount;
    private ArrayList<FreeItemDecorator> freeItems;
    protected ArrayList<FoodItem> items;
    
    public CustomCombo(String name) {
        this.name = name;
        this.discount = 0;
        this.price = 0;
        this.freeItems = new ArrayList<FreeItemDecorator>();
        items = new ArrayList<FoodItem>();
    }

    public void addItem(FoodItem item){
        items.add(item);
        price+=item.getPrice();
    }

    public void removeItem(FoodItem item){
        if (items.contains(item)){
            items.remove(item);
            price-=item.getPrice();
        }
        else {
            System.out.println("Error Removing. Item not found in the combo");
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public String getDetails(){
        String details=name;
        for(FoodItem item:items){
            details+="\n  -"+item.getName();
        }
        for(FreeItemDecorator item:freeItems){
            details+="\n  -"+item.getName();
        }
        details+="\nTotal - "+(int)price+"\nDiscount - "+(int)discount+"%\nDiscounted Total - "+(int)Math.ceil(price-discount*0.01*price)+"tk";
        return details;
    }

    public void setFreeItem(FoodItem item){
        this.freeItems.add(new FreeItemDecorator(item));
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
