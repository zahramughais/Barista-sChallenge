import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk(){
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    public void addMenuItem(String name, double price){
        Item item = new Item(name, price);
        menu.add(item);
        item.setIndex(menu.indexOf(item));
    }

    public void displayMenu(){
        for (Item item : menu){
            System.out.println(item.getIndex() + " " + item.getName() + " - - $"+ item.getPrice());
        }
    }

    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        Order order = new Order(name);
        // Show the user the menu, so they can choose items to add.
        displayMenu();
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();

        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")){
            int i=Integer.parseInt(itemNumber); 
            // Get the item object from the menu, and add the item to the order
            if (i < menu.size() && i >= 0){
                Item item = menu.get(i);
                order.addItem(item);
            }
            // Ask them to enter a new item index or q again, and take their input
            if(!itemNumber.equals("q")){
                System.out.println("Please enter a menu item index or q to quit:");
                itemNumber = System.console().readLine();
            }
        }

        // After you have collected their order, print the order details 
        order.getOrderTotal();

    	// as the example below. You may use the order's display method.
        order.display();
    }

    public void addMenuItemByInput(){
        System.out.println("Please enter the item name:");
        String itemName = System.console().readLine();
        
        System.out.println("Please enter the item price:");
        String strItemPrice = System.console().readLine();
        double itemPrice = Double.parseDouble(strItemPrice);
        
        addMenuItem(itemName, itemPrice);
    }

}
