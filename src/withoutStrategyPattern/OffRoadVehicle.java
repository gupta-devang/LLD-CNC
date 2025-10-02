package withoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{
  @Override
  void drive() {
    System.out.println("special drive capabilities");
  }
}
