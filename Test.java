public class Test {
public static void main(String[] args) {

    // Create 2 orders for unspecified guests (without specifying a name);
    Order order1 = new Order();
    Order order2 = new Order();

    // Create 3 orders using the overloaded constructor to give each a name for the order.
    Order order3 = new Order("Zahra");
    Order order4 = new Order("Gavin");
    Order order5 = new Order("Fasial");
    
    // Menu items
    Item item1 = new Item("mocha", 3.5);

    Item item2 = new Item("latte", 4.5);

    Item item3 = new Item("drip coffee", 1.5);
    
    Item item4 = new Item("capuccino", 3.5);

    //Implement the addItem method within the Order class

    order1.addItem(item1);
    order1.addItem(item4);

    order2.addItem(item2);
    order2.addItem(item3);

    order3.addItem(item3);
    order3.addItem(item1);

    order4.addItem(item2);
    order4.addItem(item1);

    order5.addItem(item2);
    order5.addItem(item3);

    order1.setReady(true);
    order2.setReady(false);
    order3.setReady(true);
    order4.setReady(false);
    order5.setReady(true);

    System.out.println(order1.getStatusMessage());
    System.out.println(order1.getOrderTotal());
    order3.display();
    
    CoffeeKiosk coffeeKiosk1 = new CoffeeKiosk();
    coffeeKiosk1.addMenuItemByInput();
}
}
