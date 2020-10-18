package Day1.OOPExample;

import java.math.BigDecimal;

public abstract class CarPart {
    // easy to break
    // child class enforces data integrity
    // For inheritnace, in order to use parent fields in a child, use  protected.
    protected String name;
    protected String description;
    protected BigDecimal price;

    // private - outside of class, not visible
    // protected - visible in child classes

    public CarPart(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
