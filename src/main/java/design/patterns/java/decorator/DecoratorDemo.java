package design.patterns.java.decorator;

public class DecoratorDemo {

  /**
   * Demo of Decorator Design pattern where Decorator's are added to Concrete Class
   * HondaCar is Concrete Component
   * LuxuryCar or SportsCar based on Abstract Decorator Class
   * @param args
   */
  public static void main(String[] args) {

    Car sportCar = buildSportsHondaCar();
    sportCar.assemble();

    Car luxuryCar = buildLuxuryHondaCar();
    luxuryCar.assemble();
  }

  private static Car buildSportsHondaCar() {
    Car baseCar1 = new HondaCar();
    Car sportCar = new SportsFeature(baseCar1);
    return sportCar;
  }

  private static Car buildLuxuryHondaCar() {
    Car baseCar2 = new HondaCar();
    Car luxuryCar = new LuxuryFeature(baseCar2);
    return luxuryCar;
  }

}
