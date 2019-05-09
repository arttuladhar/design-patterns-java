package design.patterns.java.decorator;

public class SportsFeature extends CarDecorator{

    public SportsFeature(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Features of Sports Car");
    }
}
