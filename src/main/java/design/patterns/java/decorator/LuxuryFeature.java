package design.patterns.java.decorator;

/**
 * Concrete Decorator with Added Behaviour
 */
public class LuxuryFeature extends CarDecorator{

    public LuxuryFeature(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Features of Luxury Car");
    }
}
