package withstrategypattern.drivestrategy;

public class SportVehicle extends Vehicle{
  public SportVehicle(DriveStrategy driveStrategy) {
    super(driveStrategy);
  }
}
