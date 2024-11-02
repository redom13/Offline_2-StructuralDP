import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<FoodItem> menu = new ArrayList<FoodItem>();
        menu.add(new Burger());
        menu.add(new Fries());
        menu.add(new Wedges());
        menu.add(new Shawarma());
        menu.add(new Drink());
        menu.add(new Combo1());
        menu.add(new Combo2());
        while (true) {
            System.out.println("Press 1 to create a combo, 2 to view menu and 0 to exit");
            int choice = scn.nextInt();
            if (choice == 1){
                System.out.println("Enter the name of the combo:");
                String name = scn.next();
                CustomCombo combo = new CustomCombo(name);
                while (true) {
                    System.out.println("Available commands:");
                    System.out.println("Add [item]");
                    System.out.println("Remove [item]");
                    System.out.println("Free [item]");
                    System.out.println("Discount [percentage]");
                    System.out.println("Done");
                    String command = scn.next();
                    if (command.equalsIgnoreCase("Add")) {
                        String itemName = scn.next();
                        for (FoodItem item : menu) {
                            // In order to only allow available items
                            if (item.getName().toLowerCase().contains(itemName.toLowerCase())) {
                                combo.addItem(item);
                                System.out.println("Item added Successfully\n");
                                break;
                            }
                            // else {
                            //     System.out.println("Item not available\n");
                            // }
                        }
                    } else if (command.equalsIgnoreCase("Remove")) {
                        String itemName = scn.next();
                        for (FoodItem item : menu) {
                            if (item.getName().toLowerCase().contains(itemName.toLowerCase())) {
                                combo.removeItem(item);
                                System.out.println("Item removed Successfully\n");
                                break;
                            }
                            // else {
                            //     System.out.println("Item not available\n");
                            // }
                        }
                    } else if (command.equalsIgnoreCase("Free")) {
                        String itemName = scn.next();
                        for (FoodItem item : menu) {
                            if (item.getName().toLowerCase().contains(itemName.toLowerCase())) {
                                combo.setFreeItem(item);
                                System.out.println("Free item added\n");
                                break;
                            }
                        }
                    } else if (command.equalsIgnoreCase("Discount")) {
                        double discount = scn.nextDouble();
                        combo.setDiscount(discount);
                        System.out.println("Discount added\n");
                    } else if (command.equalsIgnoreCase("Done")) {
                        menu.add(combo);    
                        System.out.println(combo.getDetails());
                        break;
                    }
                    else {
                        System.out.println("Invalid command\n");
                    }
                }
            }
            else if (choice == 2){
                printMenu(menu);
            }
            else if (choice == 0){
                break;
            }
        }
        scn.close();
    }
    
    public static void printMenu(ArrayList<FoodItem> menu){
        for(FoodItem item:menu){
            System.out.println(item.getDetails());
        }
    }

}
