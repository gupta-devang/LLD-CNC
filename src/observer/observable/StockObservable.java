package observer.observable;

import observer.observer.NotificationAlertObserver;

public interface StockObservable {
  void add(NotificationAlertObserver observer);
  void remove(NotificationAlertObserver observer);
  void notifySubscribers();
  void setCount(int count);
  int getCount();

}
