package Day1.OOPExample;

public class Item {
    // If fields were to be kept public
    // We would always read AND write
    private String name;
    private double price;
    private float amount;

    public Item(String name, double price, float amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    // Encapsulation:
    // Access modifier (private/public)
    // Getter/Setter
    // Put the related data and methods together

    // With setters and getter we can mix read and write access.
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public float getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("Name = %s Price = %.2f Amount = %.2f",
                this.getName(), this.getPrice(), this.getAmount());
    }
}
