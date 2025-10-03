package withstrategypattern.drivestrategy;

public class Main {
  public static void main(String[] args) {
    Vehicle sportVehicle = new SportVehicle(new SpecialDriveStrategy());
    sportVehicle.drive();
  }
}
