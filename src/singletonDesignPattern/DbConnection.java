package singletonDesignPattern;

import java.io.Serial;
import java.io.Serializable;

public class DbConnection implements Serializable, Cloneable {

  private DbConnection() {
    if (DbConnectionHelper.connection != null) {
      throw new UnsupportedOperationException();
    }
  }

  public static DbConnection getDbConnection() {
    return DbConnectionHelper.connection;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return DbConnectionHelper.connection;
  }

  @Serial
  protected Object readResolve() {
    System.out.println("Read Resolve method is called");
    return DbConnectionHelper.connection;
  }

  public Object getClone() throws CloneNotSupportedException {
    return DbConnectionHelper.connection.clone();
  }

  private static class DbConnectionHelper {
    private static final DbConnection connection = new DbConnection();
  }
}
