package Day1.OOPExample;

import java.math.BigDecimal;

public class Wheel extends CarPart{
    private float pressure;
    private float diameter;

    public Wheel(String name, String description, BigDecimal price, float pressure, float diameter) {
        super(name, description, price);
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }
}
