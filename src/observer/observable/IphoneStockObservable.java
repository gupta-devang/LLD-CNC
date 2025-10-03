package observer.observable;

import observer.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable {
  private List<NotificationAlertObserver> list = new ArrayList<>();
  private int count;
  @Override
  public void add(NotificationAlertObserver observer) {
    list.add(observer);
  }

  @Override
  public void remove(NotificationAlertObserver observer) {
    list.remove(observer);
  }

  @Override
  public void notifySubscribers() {
    list.forEach(NotificationAlertObserver::update);
  }

  @Override
  public void setCount(int count) {
    this.count = count;
    notifySubscribers();
  }

  @Override
  public int getCount() {
    return count;
  }
}
