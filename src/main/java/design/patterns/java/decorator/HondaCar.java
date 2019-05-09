package design.patterns.java.decorator;

/**
 * Concrete Component - Class having function added to it
 */
public class HondaCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling Honda Car");
    }
}
