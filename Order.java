import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    // GETTERS & SETTERS
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isReady() {
        return ready;
    }
    
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    
    public ArrayList<Item> getItems() {
        return items;
    }
    
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    // ORDER METHODS

    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if (this.isReady()){
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double total = 0.0;
        for (int i =0; i<this.items.size(); i++){
            total += items.get(i).getPrice();
        }
        return total;
    }

    public void display(){
        // Customer Name: Cindhuri
        System.out.println("Customer Name: " + this.name);

        // drip coffee - $1.50
        // capuccino - $3.50
        for (int i = 0; i<this.items.size(); i++){
        System.out.println(items.get(i).getName() +" - $"+ items.get(i).getPrice());
        } 

        // Total: $5.00
        System.out.println("Total: $" + this.getOrderTotal());
    }
}