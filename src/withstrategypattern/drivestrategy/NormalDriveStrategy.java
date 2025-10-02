package withstrategypattern.drivestrategy;

public class NormalDriveStrategy implements DriveStrategy{
  @Override
  public void drive() {
    System.out.println("Normal Capabilities");
  }
}
