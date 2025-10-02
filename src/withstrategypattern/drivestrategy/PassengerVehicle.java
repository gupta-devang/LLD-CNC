package withstrategypattern.drivestrategy;

public class PassengerVehicle extends Vehicle {
  public PassengerVehicle(DriveStrategy driveStrategy) {
    super(driveStrategy);
  }
}
