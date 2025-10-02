package observer.observer;

import observer.observable.IphoneStockObservable;
import observer.observable.StockObservable;

public class MobileNotification implements NotificationAlertObserver{
  StockObservable observable;

  public MobileNotification(StockObservable observable) {
    this.observable = observable;
  }

  @Override
  public void update() {
    System.out.println("phones are back in stock. Notification sent on mobile");
    System.out.println("current qty : " + observable.getCount());

  }
}
