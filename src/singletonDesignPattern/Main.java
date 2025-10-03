package singletonDesignPattern;

public class Main {
  public static void main(String[] args) {
    DbConnection dbConnection = DbConnection.getDbConnection();
  }
}
