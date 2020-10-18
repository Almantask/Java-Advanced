package Day1.OOPExample;

import jdk.jshell.spi.ExecutionControl;

import java.awt.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        Item mandarin = new Item("Mandarin", 1.00, 0.02f);
        //System.out.println(mandarin);
        System.out.println(mandarin);

        // floating point
        // BigDecimal = money, scientific calculation
        Euro moneyEuro = new Euro(new BigDecimal("100"));
        System.out.println(moneyEuro);
        Litas moneyLit = moneyEuro.toLitas();
        System.out.println(moneyLit);

        Wheel wheel = new Wheel("RX", "Some wheel", new BigDecimal("45"), 3, 16);
        Chasis body = new Chasis("Titanium", "X-3", new BigDecimal("10"), Color.BLACK);

        // Polymorphism
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Helicopter helicopter1 = new Helicopter();
        Helicopter helicopter2 = new Helicopter();
        Vehicle[] vehicles = {car1, car2, car3, helicopter1, helicopter2};
        for (Vehicle vehicle :
                vehicles) {
            // Different types (Car, Helicopter) used as the same (one)
            vehicle.go();
        }

        // Abstraction- Depend on abstraction, not implementation
        Vehicle car = new Car();
        //Car car = new Car();
        // Main data structures:List, Map, Card
        // List has a mutable size.
        List<String> textsList = new ArrayList<>();
        // Size does not change.
        // We must know the size in advance
        String[] textsArray = new String[0];
        // Key + value pairs
        Map<Integer, String> textsMap = new HashMap<>();

        // {Coordinate, Town}
        // List: search, will have to iterate through it
        // Map:

        List<Town> townsList = new ArrayList<>();
        Map<String, Point> townsMap = new HashMap<>();

        // Use list when you need an array, but it needs to shrink and expand.
        // constant * towns
        // For list, loop through all and do comparison.
        Point locationOfVilnius1;
        for (Town town :
                townsList) {
            if(town.getName().equals("Vilnius")){
                locationOfVilnius1 = town.getLocation();
            }
        }

        // Use map to get something (value) by something (key)
        // constant time
        // For map, immediate lookup
        Point locationOfVilnius2 = townsMap.get("Vilnius");

        Card card = new Card(Card.Rank.Jack, Card.Suite.Diamonds);
        System.out.println(card);
    }
}
