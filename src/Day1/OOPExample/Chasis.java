package Day1.OOPExample;

import java.awt.*;
import java.math.BigDecimal;

public class Chasis extends CarPart {
    public Color color;

    public Chasis(String name, String description, BigDecimal price, Color color) {
        super(name, description, price);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
