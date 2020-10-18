package Day1.OOPExample;
// Composition
public class Car implements Vehicle{
    private Chasis chasis;
    private Wheel[] wheels;

    public Car(){
    }

    @Override
    public void go(){
        System.out.println("Wrooom wroom");
    }
}
