package multithreading;

public class MonitorLockExample {
  public synchronized void task1() {
    System.out.println("Inside task1");
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public void task2() {
    synchronized(this) {
      System.out.println("task2 inside synchronized");
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println("task2 completed");
    }
  }

  public void task3() {
    System.out.println("task3");
  }
}
