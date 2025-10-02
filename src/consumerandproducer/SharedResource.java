package consumerandproducer;

import java.util.ArrayDeque;
import java.util.Queue;

public class SharedResource {
  Queue<Integer> q = new ArrayDeque<>();
  int size;

  public SharedResource(int size) {
    this.size = size;
  }
  public synchronized void produce(int i) {
    while (this.q.size() == this.size) {
      try {
        System.out.println("Queue is full waiting for it to be empty");
        wait();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    q.add(i);
    System.out.println("Added the item " + i);
    notifyAll();
  }
  public synchronized void consume() {
    while (q.isEmpty()) {
      try {
        System.out.println("Queue is empty");
        wait();
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    int item = q.remove();
    System.out.println("Consumed Item: " + item);
    notifyAll();
  }
}
