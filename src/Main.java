import singletonDesignPattern.DbConnection;
import withstrategypattern.drivestrategy.SpecialDriveStrategy;
import withstrategypattern.drivestrategy.SportVehicle;
import withstrategypattern.drivestrategy.Vehicle;

import java.io.*;

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
    //region Singleton
    DbConnection dbConnection1 = DbConnection.getDbConnection();
    String file = "/Users/devanggupta/abc.txt";
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(dbConnection1);
      objectOutputStream.close();
      fileOutputStream.close();

      FileInputStream fileInputStream = new FileInputStream(file);
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
      DbConnection dbConnection = (DbConnection) objectInputStream.readObject();
      objectOutputStream.close();
      fileInputStream.close();
      System.out.println(dbConnection.hashCode());
      System.out.println(dbConnection1.hashCode());
    } catch (IOException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
    DbConnection clone = (DbConnection) dbConnection1.getClone();
    System.out.println(clone.hashCode());
    //endregion
    Thread thread = new Thread();
    thread.start();
  }
}